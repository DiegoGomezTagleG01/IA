
package principal;

import java.awt.Color;
import java.util.ArrayList;


public class ciudad {
    int posX;
    int posY;
    int numeroCiudad;
    Color col;
    ArrayList<Integer> distancias= new ArrayList<Integer>();
    
    public ciudad(int x, int y, int num, Color c){
        posX=x;
        posY=y;
        numeroCiudad=num;
        col=c;
    }
    
    public String toString(){
    String cad="Ciudad "+numeroCiudad;
    for(int i=0;i<distancias.size();i++){
        cad+=" "+distancias.get(i);
    }
    return cad;
    }
}
