package descuento_renta;

import java.util.Scanner;

/**
 *
 * @author geova
 */

public class Descuento_Renta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu sueldo mensual ($): ");
        double sueldo = scanner.nextDouble();

        double renta = 0.0;

        if (sueldo <= 472.00) {
            renta = 0.0;
        } else if (sueldo <= 895.24) {
            renta = ((sueldo - 472.00) * 0.10) + 17.67;
        } else if (sueldo <= 2038.10) {
            renta = ((sueldo - 895.24) * 0.20) + 60.00;
        } else {
            renta = ((sueldo - 2038.10) * 0.30) + 288.57;
        }

        double sueldoNeto = sueldo - renta;

        // 4. Mostramos los resultados
        System.out.println("\n--- RESUMEN DE PAGO ---");
        System.out.println("Sueldo bruto: $" + sueldo);
        System.out.println("Descuento de Renta: $" + renta);
        System.out.println("Sueldo a recibir: $" + sueldoNeto);

        scanner.close();
    }
}