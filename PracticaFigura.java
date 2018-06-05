package practicafigura;
/**
 *
 * @author jesus
 */
import java.util.Scanner;

public class PracticaFigura {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("¿Cuántas líneas quiere que dibuje? ");
        int columna = Integer.parseInt(s.nextLine());
        if (columna < 0) {
            System.out.println("Lo siento, ha de ser un número entero y positivo.");
        } else {
            if (columna == 1) { // si el número de columna solamente es uno
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < columna; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            } else {
                System.out.print("¿Y cuántos espacios entre ellas? ");
                int espacio = Integer.parseInt(s.nextLine());
                for (int i = 0; i < 4; i++) { //altura fija de 4
                    for (int j = 0; j < columna; j++) { // dibuja el número de líneas que dice el usuario
                        System.out.print("*");
                        for (int h = 0; h < espacio; h++) { // dibuja el número de espacios que dice el usuario
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
            }
        }
    }
}
