/*5. Calcular la media de una serie de números que se leen por teclado. Leer por teclado 10 números
enteros y guardarlos en un array. A continuación calcula y muestra por separado la media de los
valores positivos y la de los valores negativos. */
import java.util.Scanner;

public class ejercicio5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int [] ArNum = new int [10];

        int sumPosit = 0;
        int sumNegat = 0;
        int countPosit = 0;
        int countNegat = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el número :" + (i + 1) + ": ");
            ArNum[i] = scanner.nextInt();

            if (ArNum[i] > 0) {
                sumPosit += ArNum[i];
                countPosit++;
            } else if (ArNum[i] < 0) {
                sumNegat += ArNum[i];
                countNegat++;
            }
        }

        if (countPosit > 0) {
            System.out.println("La media de los números positivos es: " + (double) sumPosit / countPosit);
        }

        if (countNegat > 0) {
            System.out.println("La media de los números negativos es: " + (double) sumNegat / countNegat);
        }

    }
}


