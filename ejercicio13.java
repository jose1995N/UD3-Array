/*13. Realiza un programa que calcule la estatura media, mínima y máxima en centímetros de personas de
diferentes países. El array que contiene los nombres de los países es el siguiente: país = {“España”,
“Rusia”, “Japón”, “Australia”}. Los datos sobre las estaturas se deben simular mediante un array de 4
filas por 10 columnas con números aleatorios generados al azar entre 140 y 210. Los decimales de la
media se pueden despreciar. Los nombres de los países se deben mostrar utilizando el array de países
(no se pueden escribir directamente). */
import java.util.Scanner;
public class ejercicio13 {
    
    public static void main(String[] args) {
        
        String[] paises = {"España", "Rusia", "Japón", "Australia"};
        
        
        int[][] estaturas = new int[4][10];
        Scanner scanner = new Scanner(System.in);

        
        for (int i = 0; i < 4; i++) {
            System.out.println("Introduce las estaturas para " + paises[i] + ":");
            for (int j = 0; j < 10; j++) {
                System.out.print("Persona " + (j + 1) + ": ");
                estaturas[i][j] = scanner.nextInt();
            }
        }

       
        for (int i = 0; i < 4; i++) {
            int suma = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            
           
            for (int j = 0; j < 10; j++) {
                int estatura = estaturas[i][j];
                suma += estatura;
                if (estatura < min) min = estatura;
                if (estatura > max) max = estatura;
            }

           
            int media = suma / 10;

           
            System.out.println(paises[i] + ":");
            System.out.println("  Media: " + media + " cm");
            System.out.println("  Mínima: " + min + " cm");
            System.out.println("  Máxima: " + max + " cm");
            System.out.println();
        }

        scanner.close(); 
    }
}

