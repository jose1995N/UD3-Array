/*3. Crea un método que reciba un Array de Strings y un char. Deberá mostrar
todas las Strings cuya primera letra sea el char pasado como parámetro. */
public class ejercicio3 {

    public static void main(String[] args) {
        String[] arrayDeCadenas = {"manzana", "banana", "cereza", "mango", "pera", "melon"};
        char primercaracter = 'm';

        for (String str : arrayDeCadenas) {
            if (str.length() > 0 && str.charAt(0) == primercaracter) {
                System.out.println(str);
            }
        }
    }
}

