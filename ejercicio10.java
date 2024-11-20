/*10. Escribe un programa que rellene un array de 20 elementos con números enteros aleatorios
comprendidos entre 0 y 400 (ambos incluidos). A continuación el programa mostrará el array y
 preguntará si el usuario quiere resaltar los múltiplos de 5 o los múltiplos de 7. Seguidamente se
volverá a mostrar el array escribiendo los números que se quieren resaltar entre corchetes*/

import java.util.Scanner;
public class ejercicio10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] array = new int[20];
    
            
            System.out.println("Por favor, introduce 20 números enteros entre 0 y 400:");
            for (int i = 0; i < array.length; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                int input = scanner.nextInt();
                
                if (input >= 0 && input <= 400) {
                    array[i] = input;
                } else {
                    System.out.println("Número fuera del rango (0-400), se establecerá a 0.");
                    array[i] = 0;
                }
            }
    
           
            System.out.println("Array original:");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
    
           
            System.out.print("¿Quieres resaltar los múltiplos de 5 o de 7? (escribe 5 o 7): ");
            int opcion = scanner.nextInt();
    
           
            if (opcion == 5 || opcion == 7) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] % opcion == 0) {
                        System.out.print("[" + array[i] + "] ");
                    } else {
                        System.out.print(array[i] + " ");
                    }
                }
                System.out.println();
            } else {
                System.out.println("Opción no válida");
            }
    
            scanner.close();
        }
    }
    
     

