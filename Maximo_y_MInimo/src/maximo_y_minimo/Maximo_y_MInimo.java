/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maximo_y_minimo;

/**
 *
 * @author geova
 */
import java.util.Scanner;

public class Maximo_y_MInimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[5];

        System.out.println("ingresa 5 numeros enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero [" + i + "]: ");
            numeros[i] = scanner.nextInt();
        }

        int maximo = numeros[0];
        int posicionMaximo = 0;

        int minimo = numeros[0];
        int posicionMinimo = 0;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
                posicionMaximo = i;
            }

            if (numeros[i] < minimo) {
                minimo = numeros[i];
                posicionMinimo = i;
            }
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("El numero MAXIMO es: " + maximo + " (en la posiciOn/indice: " + posicionMaximo + ")");
        System.out.println("El numero MINIMO es: " + minimo + " (en la posiciOn/indice: " + posicionMinimo + ")");

        scanner.close();
    }
}