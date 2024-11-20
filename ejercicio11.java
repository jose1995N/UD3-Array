/* 11. Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna los valores
según la siguiente tabla. Muestra el contenido de todos los elementos del array dispuestos en forma
de tabla como se muestra en la figura.*/

public class ejercicio11 {
        public static void main(String[] args) {
           
            int[][] num = {{0,30,2,0,5}, {75,0,0,0,0}, {13, 14, 15, 16, 17, 18} 
            };
            
            for (int i = 0; i < num.length; i++) {
                    System.out.print("fila"+ i + " ");
                for (int index = 0; index < num[i].length; index++) {
                    System.out.print(num[i][index]+ " ");
                }
                System.out.println(); 
                }
               
            }
        }
    
    
            
    
    

