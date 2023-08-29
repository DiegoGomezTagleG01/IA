
package principal;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;

public class cluster {
    int puntosInicialesX;
    int puntosIncialesY;
    
    int puntosx;
    int puntosy;
    int puntoAnteriorX;
    int puntoAnteriorY;
    int noCluster;
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
    public String puntos(){
        String cad="";
        int j=0;
        for(int i=0;i<puntosX.size();i++){
            j++;
            cad+="\nPunto Numero "+j+"("+puntosX.get(i)+","+puntosY.get(i)+")";
        
        }
        return cad;
    }
    
    public String toString(){
    String cad="\nCluster No:" +noCluster;
    cad+="\nPunto inicial: "+"("+puntosInicialesX+","+puntosIncialesY+")";
    cad+="\nPunto Final: "+"("+puntosx+","+puntosy+")";
    cad+="\nPuntos Clasificados: "+ puntosX.size();
    cad+="\nColor: "+col.toString();
    cad+="\n Puntos: "+puntos();
    return cad;
    }
}
