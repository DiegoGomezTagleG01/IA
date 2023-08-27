
package principal;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;

public class cluster {
    int puntosx;
    int puntosy;
    int puntoAnteriorX;
    int puntoAnteriorY;
    boolean igual;
    Color col;
    ArrayList<Integer> puntosX= new ArrayList<>();
    ArrayList<Integer> puntosY= new ArrayList<>();
    
    cluster(int px, int py,Color c){
        puntosx=px;
        puntosy=py;
        col=c;
    }
    public void centroide(){
        puntoAnteriorX= puntosx;
        puntoAnteriorY=puntosy;
        puntosx=(int)promedio(puntosX);
        puntosy=(int)promedio(puntosY);
    }
    public double promedio(ArrayList<Integer> n){
        double promedio=0;
        for (int num : n) {
            promedio += num;
        }
        return promedio/n.size();
        
    }
}
