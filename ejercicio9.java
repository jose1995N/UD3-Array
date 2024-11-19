/*9. Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en
un array. El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del
array (del 0 en adelante) y todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
es necesario.*/

import java.util.Random;
public class ejercicio9 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[20];

        for (int i = 0; i < 20; i++) {
            numeros[i] = random.nextInt(100);
        }

        int i = 0, j = 19;
        while (i < j) {
            if (numeros[i] % 2 == 0) {
                i++;
            } else if (numeros[j] % 2 != 0) {
                j--;
            } else {
                int temp = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temp;
                i++;
                j--;
            }
        }
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}


