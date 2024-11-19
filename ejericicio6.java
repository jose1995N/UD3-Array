/*6-Programa que lee por teclado la nota de los alumnos de una clase y calcula la nota media del grupo.
También muestra los alumnos con notas superiores a la media. El número de alumnos se lee por
teclado. */
import java.util.Scanner;

public class ejericicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Introduce el número de alumnos: ");
        int numAlumnos = scanner.nextInt();

        
        double[] notas = new double[numAl];
        double sumaNotas = 0;

        
        for (int i = 0; i < numAl; i++) {
            System.out.print("Introduce la nota del alumno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            sumaNotas += notas[i];  
        }

       
        double media = sumaNotas / numAl;
        System.out.println("La nota media del grupo es: " + media);

       
        System.out.println("Alumnos con notas superiores a la media:");
        for (int i = 0; i < numAl; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno " + (i + 1) + " con nota: " + notas[i]);
            }
        }
    }
}


