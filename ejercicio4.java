/*4. Crea un método que reciba dos Arrays como parámetros, y devuelva un Array
con los valores máximos en cada una de las posiciones. Se debe tener en
cuenta que los Arrays podrán ser de tamaños distintos */

import java.util.Arrays;

public class ejercicio4 {
    public static void main(String[] args) {
        int[] ar1 = {4, 8, 15, 1};
        int[] ar2 = {7, 2, 11, 18};

        for (int i = 0; i < tamañoMaximo; i++) {
            if (i < ar1.length && i < ar2.length) {
                maximos[i] = Math.max(ar1[i], ar2[i]);
            } 
            else if (i < ar1.length) {
                maximos[i] = ar1[i];
            } else {
                maximos[i] = ar2[i];
            }
        }
    }
}

