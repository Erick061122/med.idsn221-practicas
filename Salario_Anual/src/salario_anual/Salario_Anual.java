package salario_anual;

/**
 *
 * @author geova
 */
import java.util.Scanner;

public class Salario_Anual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese su salario anual: ");
            String entrada = scanner.nextLine();

            double salario = Double.parseDouble(entrada);

            double impuesto = 0;
            if (salario > 10000) {
                impuesto = salario * 0.10;
            }

            System.out.println("El impuesto a pagar es: " + impuesto);

        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un salario numerico valido.");
        } finally {
            scanner.close();
        }
    }
}
