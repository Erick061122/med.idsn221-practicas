package empleados;

/**
 *
 * @author geova
 */
import java.util.Scanner;

public class Empleados {

    static class Empleado {
        String nombre;
        String cargo;
        double sueldo;

        public Empleado(String nombre, String cargo, double sueldo) {
            this.nombre = nombre;
            this.cargo = cargo;
            this.sueldo = sueldo;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("--- Empleado " + (i + 1) + " ---");
            
            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el cargo: ");
            String cargo = scanner.nextLine();

            System.out.print("Ingrese el sueldo: ");
            double sueldo = Double.parseDouble(scanner.nextLine());

            empleados[i] = new Empleado(nombre, cargo, sueldo);
            System.out.println();
        }

        System.out.println("         EMPLEADOS REGISTRADOS            ");
        
        for (int i = 0; i < empleados.length; i++) {
            System.out.println((i + 1) + ". " + empleados[i].nombre + 
                               " | Cargo: " + empleados[i].cargo + 
                               " | Sueldo: $" + empleados[i].sueldo);
        }

        scanner.close();
    }
}
