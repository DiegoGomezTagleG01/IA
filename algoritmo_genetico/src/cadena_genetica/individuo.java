package cadena_genetica;

/**
 *
 * @author Alvaro
 */
public class individuo extends Thread {

    String cadena_original;
    String cadena;
    int lenCadena;
    int calificacion;
    int noGeneracion;

    @Override
    public String toString() {
        return noGeneracion + ".- " + cadena + " = " + calificacion;
    }

    public individuo(int noGeneracion, int lenCadena, String cadena_original) {
        this.noGeneracion = noGeneracion;
        this.lenCadena = lenCadena;
        this.cadena_original = cadena_original;
    }

    public void run() {
        generar();
        setCalificacion(evaluar());
        System.out.println(this.toString());
    }

    // https://elcodigoascii.com.ar/
    public void generar() {
        String cad = "";
        for (int i = 0; i < lenCadena; i++) {
            // desde 65 a 122
            int numeroAleatorio = (int) ((Math.random() * 52) + 65);
            if (numeroAleatorio > 90) {
                numeroAleatorio += 6; // Z-a NO
            }
            char letraAleatoria = (char) numeroAleatorio;
            cad += letraAleatoria;
        }
        setCadena(cad);
}

    public int evaluar() {
        int similitud = 0;

        // se debe recorrer las dos cadenas
        for (int i = 0; i < cadena_original.length(); i++) {
            char charOriginal = cadena_original.charAt(i);
            char char_copia = cadena.charAt(i);

            // comparar caracteres en la misma posicion
            if (charOriginal == char_copia) {
                similitud += 2; // +1 punto por coincidencia y +1 punto por misma posición
            } else {
                // Comparar si el carácter está presente en ambas cadenas
                if (cadena_original.indexOf(char_copia) != -1) {
                    similitud++; // +1 punto por coincidencia
                }
            }
        }

        return similitud;
    }


    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
