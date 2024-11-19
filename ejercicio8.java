/*8. Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla
separados por espacios. El programa pedirá entonces por teclado dos valores y a continuación
cambiará todas las ocurrencias del primer valor por el segundo en la lista generada anteriormente. */

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      
        int[] numeros = new int[100];
        for (int i = 0; i < 100; i++) {
            numeros[i] = (int) (Math.random() * 21);
        }

      
        System.out.print("Números generados: ");
        for (int i = 0; i < 100; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

       
        System.out.print("Introduce el valor a cambiar: ");
        int valor1 = scanner.nextInt();
        System.out.print("Introduce el nuevo valor: ");
        int valor2 = scanner.nextInt();

     
        for (int i = 0; i < 100; i++) {
            if (numeros[i] == valor1) {
                numeros[i] = valor2;
            }
        }

        System.out.print("Números después del cambio: ");
        for (int i = 0; i < 100; i++) {
            System.out.print(numeros[i] + " ");
        }

        scanner.close();
    }
}

