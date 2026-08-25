package registro_usuario;

/**
 *
 * @author geova
 */
import java.util.Scanner;

public class Registro_Usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese su nombre de usuario: ");
            String usuario = scanner.nextLine();

            System.out.print("Ingrese su password: ");
            String password = scanner.nextLine();

            if (password.length() < 8) {
                throw new SecurityException();
            }

            System.out.println("Registro exitoso para el usuario " + usuario + "!");

        } catch (SecurityException e) {
            System.out.println("Error: La password no cumple con los criterios de seguridad (minimo 8 caracteres).");
        } finally {
            scanner.close();
        }
    }
}