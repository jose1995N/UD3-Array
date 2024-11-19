import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
    
        int[][] matriz = new int[4][5];
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Introduce 20 números enteros:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
    
                matriz[i][j] = rand.nextInt(100) + 1; 
            }
        }
        int sumaTotal = 0;
        
        System.out.println("\nMatriz con las sumas parciales:");
        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
                sumaFila += matriz[i][j];
            }
        
            System.out.print("= " + sumaFila);
            sumaTotal += sumaFila;
            System.out.println();
        }

        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.print(sumaColumna + "\t");
        }
        System.out.println("= " + sumaTotal);
    }
}
