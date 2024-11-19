/* 11. Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna los valores
según la siguiente tabla. Muestra el contenido de todos los elementos del array dispuestos en forma
de tabla como se muestra en la figura.*/

public class ejercicio11 {
        public static void main(String[] args) {
           
            int[][] numeros = {
                {1, 2, 3, 4, 5, 6}, 
                {7, 8, 9, 10, 11, 12}, 
                {13, 14, 15, 16, 17, 18} 
            };
  
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print(numeros[i][j] + "\t"); 
                }
                System.out.println(); 
            }
        }
    }
    
            
    
    

