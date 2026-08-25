package raiz_cuadrada;

/**
 *
 * @author geova
 */
import java.util.Scanner;

public class Raiz_Cuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un numero: ");
            double numero = scanner.nextDouble();

            if (numero < 0) {
                throw new ArithmeticException();
            }

            double raiz = Math.sqrt(numero);
            System.out.println("La raiz cuadrada es: " + raiz);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede calcular la raiz cuadrada de numeros negativos.");
        } finally {
            scanner.close();
        }
    }
}
