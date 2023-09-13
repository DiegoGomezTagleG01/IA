
package cadena_genetica;

import java.util.ArrayList;


public class generacion {
    ArrayList<String> cadenas= new ArrayList<>();
    ArrayList<Integer> calificacion= new ArrayList<>();
    int lenCadena;
    int individuos;
    int noGeneracion;
    public generacion(int len, int invididuos, int nG){
        lenCadena=len;
        this.individuos= invididuos;
        noGeneracion=nG;
    }
    public void cadenasAleatoreas(){
        String cad="";
        for(int i=0;i<individuos;i++){
            for(int j=0;j<lenCadena;j++){
                int numeroAleatorio = (int) ((Math.random()*26)+'a');
                char letraAleatoria = (char) (numeroAleatorio);
                cad+= letraAleatoria;
            }
            System.out.println(cad);
            cadenas.add(cad);
            cad="";
        }
    }
    public void evaluar(String c){
        int pun=0;
        for(int i=0;i<individuos;i++){
            
            for(int j=0;j<c.length();j++){
                
                for(int k=0;k<cadenas.get(i).length();k++){
                    if(cadenas.get(i).charAt(k)==c.charAt(j)){
                        pun++;
                        if(k==j){
                            pun++;
                    
                        }
                    }
                }
            }
            calificacion.add(pun);
            pun=0;
        }
    }
  
    
    public String toString(){
        String cad="\nNumero De generacion: "+noGeneracion;
        cad+="\nCadenas \tPuntuacion";
        for(int i=0;i<individuos;i++){
            cad+="\n"+cadenas.get(i)+" \t"+calificacion.get(i);
        }
        return cad;
    }
    
}
