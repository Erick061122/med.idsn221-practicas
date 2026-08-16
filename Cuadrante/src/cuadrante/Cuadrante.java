package cuadrante;

import java.util.Scanner;

public class Cuadrante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la coordenada X: ");
        double x = scanner.nextDouble();

        System.out.print("Ingresa la coordenada Y: ");
        double y = scanner.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("El punto (" + x + ", " + y + ") esta en el Cuadrante I (+, +).");
        } else if (x < 0 && y > 0) {
            System.out.println("El punto (" + x + ", " + y + ") esta en el Cuadrante II (-, +).");
        } else if (x < 0 && y < 0) {
            System.out.println("El punto (" + x + ", " + y + ") esta en el Cuadrante III (-, -).");
        } else if (x > 0 && y < 0) {
            System.out.println("El punto (" + x + ", " + y + ") esta en el Cuadrante IV (+, -).");
        } else if (x == 0 && y == 0) {
            System.out.println("El punto esta exactamente en el Origen (0, 0).");
        } else if (x == 0) {
            System.out.println("El punto esta sobre el Eje Y.");
        } else {
            System.out.println("El punto esta sobre el Eje X.");
        }

        scanner.close();
    }
}