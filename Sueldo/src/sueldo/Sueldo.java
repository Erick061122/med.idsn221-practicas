package sueldo;

import java.util.Scanner;

/**
 *
 * @author geova
 */

public class Sueldo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa la clase de puesto (A, B, C o D): ");
        char clase = scanner.next().toUpperCase().charAt(0); // Convierte a mayúscula la primera letra

        System.out.print("Ingresa las horas trabajadas en la semana: ");
        double horas = scanner.nextDouble();

        double tarifaHora = 0.0;
        boolean claseValida = true;

        switch (clase) {
            case 'A':
                tarifaHora = 7.00;
                break;
            case 'B':
                tarifaHora = 8.50;
                break;
            case 'C':
                tarifaHora = 10.00;
                break;
            case 'D':
                tarifaHora = 12.50;
                break;
            default:
                claseValida = false;
                System.out.println("\nError: La clase ingresada no existe.");
        }

        if (claseValida) {
            double sueldoSemanal = horas * tarifaHora;

            System.out.println("\n=== RESUMEN DE PAGO ===");
            System.out.println("Empleado: " + nombre);
            System.out.println("Clase asignada: " + clase);
            System.out.println("Tarifa por hora: $" + tarifaHora);
            System.out.println("Horas trabajadas: " + horas);
            System.out.println("Sueldo semanal a pagar: $" + sueldoSemanal);
        }

        scanner.close();
    }
}