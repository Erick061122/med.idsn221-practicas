package descuento_cine;

import java.util.Scanner;

public class Descuento_Cine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el precio del boleto ($): ");
        double precioBoleto = scanner.nextDouble();

        System.out.print("Ingresa la edad de la persona: ");
        int edad = scanner.nextInt();

        double totalAPagar;

        if (edad < 18 || edad > 60) {
            totalAPagar = precioBoleto * 0.50; // Aplica 50% de descuento
            System.out.println("\n¡Aplica 50% de descuento!");
        } else {
            totalAPagar = precioBoleto; // Paga el total completo
            System.out.println("\nNo aplica descuento.");
        }

        System.out.println("El valor a pagar por la entrada es: $" + totalAPagar);

        scanner.close();
    }
}