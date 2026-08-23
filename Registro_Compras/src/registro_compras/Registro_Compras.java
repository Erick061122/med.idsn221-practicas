package registro_compras;

/**
 *
 * @author geova
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Registro_Compras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> productos = new ArrayList<>();
        ArrayList<Double> precios = new ArrayList<>();

        String respuesta;

        do {
            System.out.print("Ingresa el nombre del producto: ");
            String producto = scanner.nextLine();

            System.out.print("Ingresa el precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer del teclado

            productos.add(producto);
            precios.add(precio);

            System.out.print("Deseas agregar otro producto? (s/n): ");
            respuesta = scanner.nextLine();

        } while (respuesta.equalsIgnoreCase("s"));

        double total = 0.0;

        System.out.println("\n--- RESUMEN DE LA COMPRA ---");
        for (int i = 0; i < productos.size(); i++) {
            String nombreProducto = productos.get(i);
            double precioProducto = precios.get(i);

            System.out.println("- " + nombreProducto + ": $" + precioProducto);
            total += precioProducto;
        }

        System.out.println("----------------------------");
        System.out.println("TOTAL DE LA COMPRA: $" + total);

        scanner.close();
    }
}
