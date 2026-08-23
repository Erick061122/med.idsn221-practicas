package orden_mayor_menor;

/**
 *
 * @author geova
 */
import java.util.Arrays;

public class Orden_Mayor_Menor {

    public static void main(String[] args) {
        int[] numeros = {1, 5, 8, 9, 2, 3, 1};

        Arrays.sort(numeros);

        System.out.println("--- ORDENADO DE MENOR A MAYOR ---");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        System.out.println("\n--- ORDENADO DE MAYOR A MENOR ---");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
}
