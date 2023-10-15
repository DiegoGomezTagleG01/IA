package principal;
import java.util.*;

public class Generacion {
    private int tam_generacion;  //integrantes de la generacion
    private int tam_posibleSolucion; //tamanio del recorrido
    private int numeroCiudades; //numero de ciudades por recorrer
    private int tam_reproduccion;   //tamanio de la cruza
    private int itecionesMax;   //maximo de iteraciones para evitar sobrecarga 
    private float probabilidad_mutacion; //probabilidad de mutacion
    private int tam_torneo;     //elementos elegidos en el torneo 
    private int[][] tablaDistancias;    //matriz de distancias
    private int ciudadInicial;  //ciudad donde empieza el recorrido
    private int aptitudObjetivo;    //aptitud que se aspira tener

    public Generacion(int numeroCiudades, int[][] tablaDistancias, int ciudadInicial, int aptitudObjetivo){
        this.numeroCiudades = numeroCiudades;
        this.tam_posibleSolucion = numeroCiudades-1;
        this.tablaDistancias = tablaDistancias;
        this.ciudadInicial = ciudadInicial;
        this.aptitudObjetivo = aptitudObjetivo;

        tam_generacion = 5000;
        tam_reproduccion = 200;
        itecionesMax = 1000;
        probabilidad_mutacion = 0.1f;
        tam_torneo = 40;
    }

    public List<vendedor> poblacionInicial(){
        List<vendedor> poblacion = new ArrayList<>();
        for(int i=0; i<tam_generacion; i++){
            poblacion.add(new vendedor(numeroCiudades, tablaDistancias, ciudadInicial));
        }
        return poblacion;
    }

    public List<vendedor> seleccion(List<vendedor> poblacion){
        List<vendedor> seleccionado = new ArrayList<>();
        for(int i=0; i<tam_reproduccion;     i++){
            seleccionado.add(ruleta(poblacion));
        }

        return seleccionado;
    }

    public vendedor ruleta(List<vendedor> poblacion){
        int totalAptitud = poblacion.stream().map(vendedor::getAptitud).mapToInt(Integer::intValue).sum();
        Random random = new Random();
        int valorSeleccionado = random.nextInt(totalAptitud);
        float recValue = (float) 1/valorSeleccionado;
        float suma = 0;
        for(vendedor posibleSolucion : poblacion){
            suma += (float) 1/posibleSolucion.getAptitud();
            if(suma>=recValue){
                return posibleSolucion;
            }
        }
        int seleccionAleatorea = random.nextInt(tam_generacion);
        return poblacion.get(seleccionAleatorea);
    }
    //metodo estatico que devuelve una lista que tiene n elementos de manera aleatorea
    public static <E> List<E> tomarElementos(List<E> list, int n) {
        Random r = new Random();
        int tam = list.size();

        if (tam < n) return null;

        for (int i = tam - 1; i >= tam - n; --i)
        {
            Collections.swap(list, i , r.nextInt(i + 1));
        }
        return list.subList(tam - n, tam);
    }

    public vendedor mutacion(vendedor ven){
        Random random = new Random();
        float mutacion = random.nextFloat();
        if(mutacion<probabilidad_mutacion) {
            List<Integer> posibleSolucionMutada = ven.getPosibleSolucion();
            Collections.swap(posibleSolucionMutada, random.nextInt(tam_posibleSolucion), random.nextInt(tam_posibleSolucion));
            return new vendedor(posibleSolucionMutada, numeroCiudades, tablaDistancias, ciudadInicial);
        }
        return ven;
    }

    public List<vendedor> generarNuevaGeneracion(List<vendedor> poblacion){
        List<vendedor> generacion = new ArrayList<>();
        int tam_generacionActual = 0;
        while(tam_generacionActual < tam_generacion){
            List<vendedor> padres = tomarElementos(poblacion,2);
            List<vendedor> hijo = cruza(padres);
            hijo.set(0, mutacion(hijo.get(0)));
            hijo.set(1, mutacion(hijo.get(1)));
            generacion.addAll(hijo);
            tam_generacionActual+=2;
        }
        return generacion;
    }

    public List<vendedor> cruza(List<vendedor> padres){
        //generamos el punto donde se cruzaran los padres
        Random random = new Random();
        int puntoDeCruza = random.nextInt(tam_posibleSolucion);
        List<vendedor> hijo = new ArrayList<>();

        // Se copian los padres para no modificarlos
        List<Integer> solucionPadre1 = new ArrayList<>(padres.get(0).getPosibleSolucion());
        List<Integer> solucionPadre2 = new ArrayList<>(padres.get(1).getPosibleSolucion());

        // cruza hijo 1
        for(int i = 0; i<puntoDeCruza; i++){
            int nuevaSolucion;
            nuevaSolucion = solucionPadre2.get(i);
            Collections.swap(solucionPadre1,solucionPadre1.indexOf(nuevaSolucion),i);
        }
        hijo.add(new vendedor(solucionPadre1,numeroCiudades,tablaDistancias,ciudadInicial));
        solucionPadre1 = padres.get(0).getPosibleSolucion(); // reseting the edited parent

        // cruza hijo 1
        for(int i = puntoDeCruza; i<tam_posibleSolucion; i++){
            int nuevaSolucion = solucionPadre1.get(i);
            Collections.swap(solucionPadre2,solucionPadre2.indexOf(nuevaSolucion),i);
        }
        hijo.add(new vendedor(solucionPadre2,numeroCiudades,tablaDistancias,ciudadInicial));

        return hijo;
    }

    public vendedor iniciar(){
        List<vendedor> poblacion = poblacionInicial(); //genera poblacion inicial
        vendedor mejorSolucion = poblacion.get(0); //inicializamos la mejor solucion 
        for(int i=0; i<itecionesMax; i++){
            List<vendedor> seleccionados = seleccion(poblacion); //realizamos el proceso de seleccion por ruleta
            poblacion = generarNuevaGeneracion(seleccionados);   //creamos una poblacion con los elementos seleccionados
            mejorSolucion = Collections.min(poblacion);     //busca el vendedor con la menor aptitud ya que buscamos la aptitud 0
            if(mejorSolucion.getAptitud() < aptitudObjetivo){ //si la aptitud de la mejor solucion es menor entonces se detiene, se encontro la solucion
                break;
            }
                
        }
        return mejorSolucion;   //devuelve al mejor vendedor
    }

    public void printGeneration(List<vendedor> generacion ){
        for( vendedor genome : generacion){
            System.out.println(genome);
        }
    }
}
