package buscar_palabra;

/**
 *
 * @author geova
 */
import java.util.Scanner;

public class Buscar_Palabra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] diccionario = {
            "Algoritmo",
            "Bucle",
            "Clase",
            "Diccionario",
            "Estructura",
            "Funcion",
            "Java",
            "Matriz",
            "Objeto",
            "Variable"
        };

        String palabraBuscada = "";
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Ingresa la palabra que deseas buscar en el diccionario: ");
                palabraBuscada = scanner.nextLine().trim();

                if (palabraBuscada.isEmpty()) {
                    throw new Exception("La entrada no puede estar vacia. Intenta de nuevo.");
                }

                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        boolean encontrada = false;
        int posicionEncontrada = -1;

        for (int i = 0; i < diccionario.length; i++) {
            if (diccionario[i].equalsIgnoreCase(palabraBuscada)) {
                encontrada = true;
                posicionEncontrada = i;
                break;
            }
        }

        System.out.println("\n--- Resultado de la Busqueda ---");
        if (encontrada) {
            System.out.println("La palabra '" + palabraBuscada + "' fue ENCONTRADA en el diccionario (posicion " + (posicionEncontrada + 1) + ").");
        } else {
            System.out.println("La palabra '" + palabraBuscada + "' NO esta en el diccionario.");
        }

        scanner.close();
    }
}
