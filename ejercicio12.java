/*Escribe un programa que pida 20 números enteros (o que los genere de forma aleatoria). Estos
números se deben introducir en un array bidimensional de 4 filas por 5 columnas. El programa
mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La suma
total debe aparecer en la esquina inferior derecha. */
import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] num = new int[4][5];
        int[] sumFilas = new int[4];
        int[] sumColumnas = new int[5];
        int sumTotal = 0;

        System.out.println("Introduce 20 números enteros:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j] = scanner.nextInt();
                sumFilas[i] += num[i][j];
                sumColumnas[j] += num[i][j];
                sumTotal += num[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(num[i][j] + "\t");
            }
            System.out.println("| Suma fila " + (i + 1) + ": " + sumFilas[i]);
        }

        for (int j = 0; j < 5; j++) {
            System.out.print("Suma col " + (j + 1) + ": " + sumColumnas[j] + "\t");
        }
    
        System.out.println("| Suma total: " + sumTotal);

        scanner.close();
    }
}

