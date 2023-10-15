package principal;
import java.util.*;

public class Main {
    public static void printTravelPrices(int[][] travelPrices, int numberOfCities){
        for(int i = 0; i<numberOfCities; i++){
            for(int j=0; j<numberOfCities; j++){
                System.out.print(travelPrices[i][j]);
                if(travelPrices[i][j]/10 == 0)
                    System.out.print("  ");
                else
                    System.out.print(' ');
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int numberOfCities = 18;
        int[][] travelPrices = new int[numberOfCities][numberOfCities];
        for(int i = 0; i<numberOfCities; i++){
            for(int j=0; j<=i; j++){
                Random rand = new Random();
                if(i==j)
                    travelPrices[i][j] = 0;
                else {
                    travelPrices[i][j] = rand.nextInt(100);
                    travelPrices[j][i] = travelPrices[i][j];
                }
            }
        }

        printTravelPrices(travelPrices,numberOfCities);

        Generacion geneticAlgorithm = new Generacion(numberOfCities, travelPrices, 0, 0);
        vendedor result = geneticAlgorithm.iniciar();
        System.out.println(result);

    }
}

