/*Crea un método que reciba un Array de Strings y muestre la String más larga. */
public class ejercicio2 {
    public static void main(String[] args) {

        String[] palabras = {"Holamundo, mellamojose"};
        int longitud, posicion=0, mayor=0;


        for (int i = 0; i < palabras.length; i++) {
            longitud = palabras[i].length();
            if (longitud> mayor) {
                mayor= longitud;
                posicion= i;   
            }    
        }
        System.out.println(palabras[posicion]);
    }

    
}
