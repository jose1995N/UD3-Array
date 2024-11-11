import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, contador=0;
        System.out.println("introduce un numero 1-6");
        num = entrada.nextInt();
        int[] listadoDeNum={1,2,2,3,3,4,5,6};
         for (int i = 0; i < listadoDeNum.length; i++) {
            if (listadoDeNum[i] == num) {
                contador++;
                
            }
         }
         System.out.println("El numero "+  num +" se repite " + contador);
    }
}
