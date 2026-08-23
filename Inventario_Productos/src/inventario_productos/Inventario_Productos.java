package inventario_productos;

/**
 *
 * @author geova
 */
import java.util.Scanner;

public class Inventario_Productos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos productos deseas registrar en el inventario?: ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine();

        String[][] inventario = new String[cantidadProductos][3];

        System.out.println("\n--- REGISTRO DE PRODUCTOS ---");
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("Producto #" + (i + 1) + ":");

            System.out.print("  Nombre: ");
            inventario[i][0] = scanner.nextLine();

            System.out.print("  Precio ($): ");
            inventario[i][1] = scanner.nextLine();

            System.out.print("  Cantidad: ");
            inventario[i][2] = scanner.nextLine();
        }

        double valorTotalInventario = 0.0;

        System.out.println("\n--- INVENTARIO DE LA TIENDA ---");
        for (int i = 0; i < cantidadProductos; i++) {
            String nombre = inventario[i][0];
            double precio = Double.parseDouble(inventario[i][1]);
            int cantidad = Integer.parseInt(inventario[i][2]);

            double subtotal = precio * cantidad;
            valorTotalInventario += subtotal;

            System.out.printf("- %s | Precio: $%.2f | Cantidad: %d | Subtotal: $%.2f\n",
                    nombre, precio, cantidad, subtotal);
        }

        System.out.println("--------------------------------------------------");
        System.out.printf("VALOR TOTAL DEL INVENTARIO: $%.2f\n", valorTotalInventario);

        scanner.close();
    }
}
