package principal;
import java.util.*;

public class vendedor implements Comparable {
    List<Integer> posibleSolucion; //genoma 
    int[][] tablaDistancias;
    int ciudadInicial;
    int numeroCiudades = 0;
    int aptitud;
    //constructor pricipal
    public vendedor(int numeroCiudades, int[][] tablaDistancias, int ciudadInicial){
        this.tablaDistancias = tablaDistancias;
        this.ciudadInicial = ciudadInicial;
        this.numeroCiudades = numeroCiudades;
        posibleSolucion = ruta();
        aptitud = this.calcularAptitud();
    }
    //este constructor se usa cuando existio una mutacion 
    public vendedor(List<Integer> solucionMutada, int numeroCiudades, int[][] tablaDistancias, int ciudadInicial){
        posibleSolucion = solucionMutada;
        this.tablaDistancias = tablaDistancias;
        this.ciudadInicial = ciudadInicial;
        this.numeroCiudades = numeroCiudades;
        aptitud = this.calcularAptitud();
    }

    public int calcularAptitud(){
        int aptitud = 0;
        int ciudadActual = ciudadInicial;
        for ( int gen : posibleSolucion) {
            aptitud += tablaDistancias[ciudadActual][gen];
            ciudadActual = gen;
        }
        aptitud += tablaDistancias[posibleSolucion.get(numeroCiudades-2)][ciudadInicial];
        return aptitud;
    }
    //genera una posible ruta
    private List<Integer> ruta(){
        List<Integer> resultado = new ArrayList<Integer>();
        for(int i=0; i<numeroCiudades; i++) {
            if(i!=ciudadInicial)
                resultado.add(i);
        }
        Collections.shuffle(resultado); //ordena los elementos de forma aleatorea 
        return resultado;
    }

    public List<Integer> getPosibleSolucion() {
        return posibleSolucion;
    }

    public int getciudadInicial() {
        return ciudadInicial;
    }

    public int getAptitud() {
        return aptitud;
    }

    public void setAptitud(int aptitud) {
        this.aptitud = aptitud;
    }

    @Override
    public String toString() {
        String cad="\nVendedor";
        cad+="\nRuta: ["+ ciudadInicial+"]";
        posibleSolucion.add(ciudadInicial);
        for ( int solucion: posibleSolucion ) {
            cad+=" ";
            cad+=" ["+solucion+"]";
        }
        cad+="\nDistancia: "+this.aptitud;
        return cad;
    }


    @Override
    //comparamos los vendedores por su aptitud, esto nos sirve para acomodar de menor a mayor
    public int compareTo(Object o) { 
        vendedor posibleSolucion = (vendedor) o;
        if(this.aptitud > posibleSolucion.getAptitud()) //si la aptitud es mayor a la posiblesolucion, devuelve 1
            return 1;
        else if(this.aptitud < posibleSolucion.getAptitud()) //si la aptitud es menor a la posiblesolucion, devuelve -1
            return -1;
        else
            return 0; //si la aptitud es igual a la posiblesolucion, devuelve 0
    }
}
