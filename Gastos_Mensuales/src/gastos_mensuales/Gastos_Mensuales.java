package gastos_mensuales;

/**
 *
 * @author geova
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Gastos_Mensuales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> descripciones = new ArrayList<>();
        ArrayList<Double> montos = new ArrayList<>();

        String respuesta;

        do {
            System.out.print("Ingrese la descripcion del gasto: ");
            String descripcion = scanner.nextLine();

            System.out.print("Ingrese el monto del gasto ($): ");
            double monto = scanner.nextDouble();
            scanner.nextLine();

            descripciones.add(descripcion);
            montos.add(monto);

            System.out.print("Desea ingresar otro gasto? (s/n): ");
            respuesta = scanner.nextLine();

        } while (respuesta.equalsIgnoreCase("s"));

        double totalGastado = 0.0;

        System.out.println("\n--- REGISTRO DE GASTOS MENSUALES ---");
        for (int i = 0; i < descripciones.size(); i++) {
            String desc = descripciones.get(i);
            double montoGasto = montos.get(i);

            System.out.printf("- %s: $%.2f\n", desc, montoGasto);
            totalGastado += montoGasto;
        }

        System.out.println("------------------------------------");
        System.out.printf("TOTAL GASTADO EN EL MES: $%.2f\n", totalGastado);

        scanner.close();
    }
}
