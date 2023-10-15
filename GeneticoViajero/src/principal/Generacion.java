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
    private SelectionType selectionType;
    private int[][] tablaDistancias;
    private int ciudadInicial;
    private int aptitudObjetivo;

    public Generacion(int numeroCiudades, SelectionType selectionType, int[][] tablaDistancias, int ciudadInicial, int aptitudObjetivo){
        this.numeroCiudades = numeroCiudades;
        this.tam_posibleSolucion = numeroCiudades-1;
        this.selectionType = selectionType;
        this.tablaDistancias = tablaDistancias;
        this.ciudadInicial = ciudadInicial;
        this.aptitudObjetivo = aptitudObjetivo;

        tam_generacion = 5000;
        tam_reproduccion    = 200;
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
        vendedor winner;
        for(int i=0; i<tam_reproduccion;     i++){
            if(selectionType == SelectionType.ROULETTE){
                seleccionado.add(rouletteSelection(poblacion));
            }
            else if(selectionType == SelectionType.TOURNAMENT){
                seleccionado.add(tournamentSelection(poblacion));
            }
        }

        return seleccionado;
    }

    public vendedor rouletteSelection(List<vendedor> poblacion){
        int totalAptitud = poblacion.stream().map(vendedor::getAptitud).mapToInt(Integer::intValue).sum();
        Random random = new Random();
        int selectedValue = random.nextInt(totalAptitud);
        float recValue = (float) 1/selectedValue;
        float currentSum = 0;
        for(vendedor genome : poblacion){
            currentSum += (float) 1/genome.getAptitud();
            if(currentSum>=recValue){
                return genome;
            }
        }
        int selectRandom = random.nextInt(tam_generacion);
        return poblacion.get(selectRandom);
    }

    public static <E> List<E> pickNRandomElements(List<E> list, int n) {
        Random r = new Random();
        int length = list.size();

        if (length < n) return null;

        for (int i = length - 1; i >= length - n; --i)
        {
            Collections.swap(list, i , r.nextInt(i + 1));
        }
        return list.subList(length - n, length);
    }

    public vendedor tournamentSelection(List<vendedor> poblacion){
        List<vendedor> selected = pickNRandomElements(poblacion,tam_torneo);
        return Collections.min(selected);
    }

    public vendedor mutate(vendedor ven){
        Random random = new Random();
        float mutate = random.nextFloat();
        if(mutate<probabilidad_mutacion) {
            List<Integer> genome = ven.getGenome();
            Collections.swap(genome, random.nextInt(tam_posibleSolucion), random.nextInt(tam_posibleSolucion));
            return new vendedor(genome, numeroCiudades, tablaDistancias, ciudadInicial);
        }
        return ven;
    }

    public List<vendedor> createGeneration(List<vendedor> poblacion){
        List<vendedor> generation = new ArrayList<>();
        int currentGenerationSize = 0;
        while(currentGenerationSize < tam_generacion){
            List<vendedor> parents = pickNRandomElements(poblacion,2);
            List<vendedor> children = crossover(parents);
            children.set(0, mutate(children.get(0)));
            children.set(1, mutate(children.get(1)));
            generation.addAll(children);
            currentGenerationSize+=2;
        }
        return generation;
    }

    public List<vendedor> crossover(List<vendedor> parents){
        // housekeeping
        Random random = new Random();
        int breakpoint = random.nextInt(tam_posibleSolucion);
        List<vendedor> children = new ArrayList<>();

        // copy parental genomes - we copy so we wouldn't modify in case they were
        // chosen to participate in crossover multiple times
        List<Integer> parent1Genome = new ArrayList<>(parents.get(0).getGenome());
        List<Integer> parent2Genome = new ArrayList<>(parents.get(1).getGenome());

        // creating child 1
        for(int i = 0; i<breakpoint; i++){
            int newVal;
            newVal = parent2Genome.get(i);
            Collections.swap(parent1Genome,parent1Genome.indexOf(newVal),i);
        }
        children.add(new vendedor(parent1Genome,numeroCiudades,tablaDistancias,ciudadInicial));
        parent1Genome = parents.get(0).getGenome(); // reseting the edited parent

        // creating child 2
        for(int i = breakpoint; i<tam_posibleSolucion; i++){
            int newVal = parent1Genome.get(i);
            Collections.swap(parent2Genome,parent2Genome.indexOf(newVal),i);
        }
        children.add(new vendedor(parent2Genome,numeroCiudades,tablaDistancias,ciudadInicial));

        return children;
    }

    public vendedor optimize(){
        List<vendedor> poblacion = poblacionInicial();
        vendedor globalBestGenome = poblacion.get(0);
        for(int i=0; i<itecionesMax; i++){
            List<vendedor> selected = seleccion(poblacion);
            poblacion = createGeneration(selected);
            globalBestGenome = Collections.min(poblacion);
            if(globalBestGenome.getAptitud() < aptitudObjetivo)
                break;
        }
        return globalBestGenome;
    }

    public void printGeneration(List<vendedor> generation ){
        for( vendedor genome : generation){
            System.out.println(genome);
        }
    }
}
