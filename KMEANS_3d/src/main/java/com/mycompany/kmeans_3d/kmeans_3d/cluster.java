
package com.mycompany.kmeans_3d.kmeans_3d;

import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.math.plot.Plot3DPanel;

public class cluster implements Runnable{
    double puntosInicialesX;
    double puntosIncialesY;
    double puntosIncialesZ;
    
    double puntosx;
    double puntosy;
    double puntosz;
    
    double puntoAnteriorX;
    double puntoAnteriorY;
    double puntoAnteriorZ;
    
    int noCluster;
    boolean igual;
    Color col;
    ArrayList<Double> puntosX= new ArrayList<>();
    ArrayList<Double> puntosY= new ArrayList<>();
    ArrayList<Double> puntosZ= new ArrayList<>();
    double rangoInferiorx;
    double rangoInferiory;
    double rangoInferiorz;
    double rangoSuperiorx;
    double rangoSuperiory;
    double rangoSuperiorz;
     Plot3DPanel plot;
    cluster( Plot3DPanel p,double px, double py,double pz,Color c){
        puntosx=px;
        puntosy=py;
        puntosz=pz;
        col=c;
        plot=p;
    }
    public void centroide(){
        puntoAnteriorX= puntosx;
        puntoAnteriorY=puntosy;
        puntoAnteriorZ=puntosz;
        if(puntosX.isEmpty()||puntosY.isEmpty()||puntosZ.isEmpty()){
            puntosx=(Math.random()*rangoSuperiorx+rangoInferiorx);
            puntosy=(Math.random()*rangoSuperiory+rangoInferiory);
            puntosz=(Math.random()*rangoSuperiorz+rangoInferiorz);
        }else{
              puntosx=promedio(puntosX);
            puntosy=promedio(puntosY);
            puntosz=promedio(puntosZ);
        }
      
    }
    public double promedio(ArrayList<Double> n){
        double promedio=0;
        for (double num : n) {
            promedio += num;
        }
        return promedio/n.size();
        
    }
    public String puntos(){
        String cad="";
        int j=0;
        for(int i=0;i<puntosX.size();i++){
            j++;
            cad+="\nPunto Numero "+j+"("+puntosX.get(i)+","+puntosY.get(i)+","+puntosZ.get(i)+")";
        
        }
        return cad;
    }
    public void dibujar(){
        
        plot.addScatterPlot("Cluster"+noCluster, convertir(puntosX),convertir(puntosY),convertir(puntosZ));
        plot.repaint();
    }
    
      public static double[] convertir(ArrayList<Double> n){
        double[]convertir= new double[n.size()];
        for(int i=0;i<n.size();i++){
            convertir[i]=n.get(i);
        }
    return convertir;
    }
     public void guardar(){
          
        String rutaArchivo = "Cluster "+noCluster+".txt";
            try {
                FileWriter escritor = new FileWriter(rutaArchivo);
                escritor.write(toString());
                escritor.close();
                System.out.println("Se ha escrito en el archivo correctamente.");
            } catch (IOException e) {
                System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
            }
            
    }
    public void run(){
        if(puntosX.isEmpty() || puntosY.isEmpty()|| puntosZ.isEmpty()){
           
            System.out.print("El Cluster no"+noCluster+ " Esta muy lejos de los datos");
        }else{
            dibujar();
            guardar();
        }
        
    }
    
    public String toString(){
    String cad="\nCluster No:" +noCluster;
    cad+="\nPunto inicial: "+"("+puntosInicialesX+","+puntosIncialesY+","+puntosIncialesZ+")";
    cad+="\nPunto Final: "+"("+puntosx+","+puntosy+","+puntosz+")";
    cad+="\nPuntos Clasificados: "+ puntosX.size();
    cad+="\nColor: "+col.toString();
    cad+="\n Puntos: "+puntos();
    return cad;
    }
}
