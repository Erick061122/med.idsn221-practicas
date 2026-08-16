package factorial;

import java.util.Scanner;

/**
 *
 * @author geova
 */

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 1. CALCULO DE FACTORIAL ===");
        System.out.print("Ingresa un numero entero (ej. 5): ");
        int numero = scanner.nextInt();

        long factorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);

        System.out.println("\n=== 2. PRIMEROS 100 NUMEROS PRIMOS ===");
        
        int contadorPrimos = 0;
        int numeroEvaluado = 2;

        while (contadorPrimos < 100) {
            boolean esPrimo = true;

            for (int i = 2; i <= numeroEvaluado / 2; i++) {
                if (numeroEvaluado % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                contadorPrimos++;
                System.out.print(numeroEvaluado + "\t");

                if (contadorPrimos % 10 == 0) {
                    System.out.println();
                }
            }

            numeroEvaluado++;
        }

        scanner.close();
    }
}