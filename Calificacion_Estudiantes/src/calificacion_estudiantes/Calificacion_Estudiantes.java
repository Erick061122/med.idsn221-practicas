package calificacion_estudiantes;

/**
 *
 * @author geova
 */
import java.util.Scanner;

public class Calificacion_Estudiantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos estudiantes deseas registrar?: ");
        int cantidad = scanner.nextInt();

        double[] notas = new double[cantidad];

        // 2. Bucle para ingresar cada una de las calificaciones
        System.out.println("\n--- INGRESO DE CALIFICACIONES ---");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double sumaTotal = 0.0;
        double notaMasAlta = notas[0];
        double notaMasBaja = notas[0];

        for (int i = 0; i < notas.length; i++) {
            sumaTotal += notas[i];

            if (notas[i] > notaMasAlta) {
                notaMasAlta = notas[i];
            }

            if (notas[i] < notaMasBaja) {
                notaMasBaja = notas[i];
            }
        }

        double promedio = sumaTotal / notas.length;

        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Promedio de calificaciones: %.2f\n", promedio);
        System.out.println("Calificacion mas ALTA: " + notaMasAlta);
        System.out.println("Calificacion mas BAJA: " + notaMasBaja);

        scanner.close();
    }
}