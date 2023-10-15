package principal;
import java.util.*;

public class vendedor implements Comparable {
    List<Integer> posibleSolucion; //genoma 
    int[][] tablaDistancias;
    int ciudadInicial;
    int numeroCiudades = 0;
    int aptitud;

    public vendedor(int numeroCiudades, int[][] tablaDistancias, int ciudadInicial){
        this.tablaDistancias = tablaDistancias;
        this.ciudadInicial = ciudadInicial;
        this.numeroCiudades = numeroCiudades;
        posibleSolucion = ruta();
        aptitud = this.calcularAptitud();
    }

    public vendedor(List<Integer> permutationOfCities, int numeroCiudades, int[][] tablaDistancias, int ciudadInicial){
        posibleSolucion = permutationOfCities;
        this.tablaDistancias = tablaDistancias;
        this.ciudadInicial = ciudadInicial;
        this.numeroCiudades = numeroCiudades;
        aptitud = this.calcularAptitud();
    }

    public int calcularAptitud(){
        int aptitud = 0;
        int ciudadActual = ciudadInicial;
        for ( int gene : posibleSolucion) {
            aptitud += tablaDistancias[ciudadActual][gene];
            ciudadActual = gene;
        }
        aptitud += tablaDistancias[posibleSolucion.get(numeroCiudades-2)][ciudadInicial];
        return aptitud;
    }

    private List<Integer> ruta(){
        List<Integer> resultado = new ArrayList<Integer>();
        for(int i=0; i<numeroCiudades; i++) {
            if(i!=ciudadInicial)
                resultado.add(i);
        }
        Collections.shuffle(resultado);
        return resultado;
    }

    public List<Integer> getGenome() {
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
        StringBuilder sb = new StringBuilder();
        sb.append("Path: ");
        sb.append(ciudadInicial);
        posibleSolucion.add(ciudadInicial);
        for ( int gene: posibleSolucion ) {
            sb.append(" ");
            sb.append(gene);
        }
        sb.append(" ");
        
        //sb.append(ciudadInicial);
        sb.append("\nLength: ");
        sb.append(this.aptitud);
        return sb.toString();
    }


    @Override
    public int compareTo(Object o) {
        vendedor posibleSolucion = (vendedor) o;
        if(this.aptitud > posibleSolucion.getAptitud())
            return 1;
        else if(this.aptitud < posibleSolucion.getAptitud())
            return -1;
        else
            return 0;
    }
}
