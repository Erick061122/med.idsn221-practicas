package buscar_elemento;

/**
 *
 * @author geova
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Buscar_Elemento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad = 0;

        while (cantidad <= 0) {
            try {
                System.out.print("Cuantos numeros deseas ingresar?: ");
                cantidad = scanner.nextInt();

                if (cantidad <= 0) {
                    System.out.println("Por favor, ingresa un numero entero mayor a 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un numero entero valido.");
                scanner.nextLine();
            }
        }

        int[] numeros = new int[cantidad];
        System.out.println("\n--- Ingreso de Numeros ---");

        for (int i = 0; i < numeros.length; i++) {
            boolean entradaValida = false;
            while (!entradaValida) {
                try {
                    System.out.print("Numero " + (i + 1) + ": ");
                    numeros[i] = scanner.nextInt();
                    entradaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Ingresa unicamente un numero entero.");
                    scanner.nextLine();
                }
            }
        }

        int maximo = numeros[0];
        int minimo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }

            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("El elemento MaXIMO es: " + maximo);
        System.out.println("El elemento MiNIMO es: " + minimo);

        scanner.close();
    }
}
