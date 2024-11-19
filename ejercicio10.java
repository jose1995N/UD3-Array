/*10. Escribe un programa que rellene un array de 20 elementos con números enteros aleatorios
comprendidos entre 0 y 400 (ambos incluidos). A continuación el programa mostrará el array y
 preguntará si el usuario quiere resaltar los múltiplos de 5 o los múltiplos de 7. Seguidamente se
volverá a mostrar el array escribiendo los números que se quieren resaltar entre corchetes*/
import java.util.Random;
import java.util.Scanner;

public class ejercicio10 {
        public static void main(String[] args) {
            int[] array = new int[20];
            Random rand = new Random();
    
            for (int i = 0; i < array.length; i++) {
                array[i] = rand.nextInt(401);
            }
    
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
            Scanner sc = new Scanner(System.in);
            System.out.print("¿Múltiplos de 5 o 7? (escribe 5 o 7): ");
            String op = sc.nextLine();
    
            for (int num : array) {
                if ((op.equals("5") && num % 5 == 0) || (op.equals("7") && num % 7 == 0)) {
                    System.out.print("[" + num + "] ");
                } else {
                    System.out.print(num + " ");
                }
            }
        }
    }
     

