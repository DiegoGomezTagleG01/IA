
package com.mycompany.kmeans_3d.kmeans_3d;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;


public class Puntos extends Thread {
    int[] puntosx;
    int[] puntosy;
    JPanel panel;
    int numPuntos;
    Puntos(JPanel p, int[] px,int[] py){
        puntosx=px;
        puntosy=py;
        panel=p;
    }
    public void generarPuntos(){
        for(int i=0;i<numPuntos;i++){
            
            puntosx[i]=(int)(Math.random()*1000+0);
            puntosy[i]=(int)(Math.random()*650+0);
        }
    }
    public void borrarPuntos(){
       Graphics g= panel.getGraphics();
       g.setColor(new Color(255,255,204)); 
       
       for (int i = 0; i < puntosx.length; i++) {
            g.fillOval(puntosx[i], puntosy[i], 10, 10);
           
        } 
    }
    public void redibujar(ArrayList<Integer> numerosGuardadosX, ArrayList<Integer> numerosGuardadosY ){
        Graphics g=panel.getGraphics();
        for(int i=0;i<numerosGuardadosX.size();i++){
            g.setColor(Color.red);
            g.fillOval(numerosGuardadosX.get(i), numerosGuardadosY.get(i), 10, 10);
        }
    }
    public void paint (Graphics g){
        g.setColor(Color.BLACK); 
        
        for (int i = 0; i < numPuntos; i++) {
            g.fillOval(puntosx[i], puntosy[i], 10, 10);
        } 
    }
    public void run(){
        paint(panel.getGraphics());
    }
}
