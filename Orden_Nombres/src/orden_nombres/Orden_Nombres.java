package orden_nombres;

/**
 *
 * @author geova
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Orden_Nombres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad = 0;

        while (cantidad <= 0) {
            try {
                System.out.print("¿Cuantos nombres deseas ingresar?: ");
                cantidad = scanner.nextInt();

                if (cantidad <= 0) {
                    System.out.println("Por favor, ingresa un numero mayor a 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un numero entero valido.");
                scanner.nextLine();
            }
        }

        scanner.nextLine();

        String[] nombres = new String[cantidad];
        System.out.println("\n--- Ingreso de Nombres ---");

        for (int i = 0; i < nombres.length; i++) {
            while (true) {
                try {
                    System.out.print("Nombre " + (i + 1) + ": ");
                    String entrada = scanner.nextLine().trim();

                    if (entrada.isEmpty()) {
                        throw new Exception("El nombre no puede estar vacío.");
                    }

                    nombres[i] = entrada;
                    break;
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }

        for (int i = 1; i < nombres.length; i++) {
            String clave = nombres[i];
            int j = i - 1;

            while (j >= 0 && nombres[j].compareToIgnoreCase(clave) > 0) {
                nombres[j + 1] = nombres[j];
                j--;
            }
            nombres[j + 1] = clave;
        }

        System.out.println("\n--- Lista de Nombres Ordenada Alfabeticamente ---");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i + 1) + ". " + nombres[i]);
        }

        scanner.close();
    }
}