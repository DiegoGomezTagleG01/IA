package principal;
import java.util.*;

public class vendedor implements Comparable {
    List<Integer> posibleSolucion;
    int[][] tablaDistancias;
    int ciudadInicial;
    int numeroCiudades = 0;
    int fitness;

    public vendedor(int numeroCiudades, int[][] tablaDistancias, int ciudadInicial){
        this.tablaDistancias = tablaDistancias;
        this.ciudadInicial = ciudadInicial;
        this.numeroCiudades = numeroCiudades;
        posibleSolucion = randomSalesman();
        fitness = this.calculateFitness();
    }

    public vendedor(List<Integer> permutationOfCities, int numeroCiudades, int[][] tablaDistancias, int ciudadInicial){
        posibleSolucion = permutationOfCities;
        this.tablaDistancias = tablaDistancias;
        this.ciudadInicial = ciudadInicial;
        this.numeroCiudades = numeroCiudades;
        fitness = this.calculateFitness();
    }

    public int calculateFitness(){
        int fitness = 0;
        int currentCity = ciudadInicial;
        for ( int gene : posibleSolucion) {
            fitness += tablaDistancias[currentCity][gene];
            currentCity = gene;
        }
        fitness += tablaDistancias[posibleSolucion.get(numeroCiudades-2)][ciudadInicial];
        return fitness;
    }

    private List<Integer> randomSalesman(){
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<numeroCiudades; i++) {
            if(i!=ciudadInicial)
                result.add(i);
        }
        Collections.shuffle(result);
        return result;
    }

    public List<Integer> getGenome() {
        return posibleSolucion;
    }

    public int getciudadInicial() {
        return ciudadInicial;
    }

    public int getFitness() {
        return fitness;
    }

    public void setFitness(int fitness) {
        this.fitness = fitness;
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
        sb.append(this.fitness);
        return sb.toString();
    }


    @Override
    public int compareTo(Object o) {
        vendedor posibleSolucion = (vendedor) o;
        if(this.fitness > posibleSolucion.getFitness())
            return 1;
        else if(this.fitness < posibleSolucion.getFitness())
            return -1;
        else
            return 0;
    }
}
