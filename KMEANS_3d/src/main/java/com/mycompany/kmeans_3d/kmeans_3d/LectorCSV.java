
package com.mycompany.kmeans_3d.kmeans_3d;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.ArrayList;


public class LectorCSV {
    ArrayList<ArrayList<String>> datos= new ArrayList<>();
    public void leer(){
        
        Path filepath = 
                Paths.get("C:\\Users\\Diego\\Documents\\NetBeansProjects\\KMEANS_3d\\Iris_DB.csv");
        try {
            BufferedReader br=Files.newBufferedReader(filepath);
            String linea;
            while((linea=br.readLine())!=null){
                String[] datosDeLinea= linea.split(",");
                ArrayList<String> datosTemporal= new ArrayList<>();
                for(String dato :datosDeLinea){
                    datosTemporal.add(dato);
                }
                datos.add(datosTemporal);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //System.out.println(datos);
    }
}
