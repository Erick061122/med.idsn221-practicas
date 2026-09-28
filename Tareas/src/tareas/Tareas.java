package tareas;

class NodoTarea {
    String nombre;
    boolean completada;
    NodoTarea siguiente;

    public NodoTarea(String nombre) {
        this.nombre = nombre;
        this.completada = false;
        this.siguiente = null;
    }
}

class ListaTareas {
    private NodoTarea cabeza;

    public ListaTareas() {
        this.cabeza = null;
    }

    public void agregarAlPrincipio(String nombre) {
        NodoTarea nuevoNodo = new NodoTarea(nombre);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
        System.out.println("Tarea al principio: \"" + nombre + "\"");
    }

    public void marcarComoCompletada(String nombre) {
        NodoTarea actual = cabeza;
        while (actual != null) {
            if (actual.nombre.equalsIgnoreCase(nombre)) {
                actual.completada = true;
                System.out.println("Tarea completada: \"" + nombre + "\"");
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("No se encontro la tarea: \"" + nombre + "\"");
    }

    public void eliminarTarea(String nombre) {
        if (cabeza == null) return;

        if (cabeza.nombre.equalsIgnoreCase(nombre)) {
            cabeza = cabeza.siguiente;
            System.out.println("Tarea eliminada: \"" + nombre + "\"");
            return;
        }

        NodoTarea actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.nombre.equalsIgnoreCase(nombre)) {
                actual.siguiente = actual.siguiente.siguiente;
                System.out.println("Tarea eliminada: \"" + nombre + "\"");
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("No se encontro la tarea a eliminar: \"" + nombre + "\"");
    }

    public void eliminarTareasCompletadas() {
        while (cabeza != null && cabeza.completada) {
            cabeza = cabeza.siguiente;
        }

        NodoTarea actual = cabeza;
        while (actual != null && actual.siguiente != null) {
            if (actual.siguiente.completada) {
                actual.siguiente = actual.siguiente.siguiente;
            } else {
                actual = actual.siguiente;
            }
        }
        System.out.println("Se han eliminado todas las tareas completadas.");
    }

    public void mostrarTareas() {
        if (cabeza == null) {
            System.out.println("\n--- La lista de tareas esta vacia ---");
            return;
        }

        System.out.println("\n--- Lista de Tareas ---");
        NodoTarea actual = cabeza;
        while (actual != null) {
            String estado = actual.completada ? "[COMPLETADA]" : "[PENDIENTE]";
            System.out.println("- " + actual.nombre + " " + estado);
            actual = actual.siguiente;
        }
        System.out.println("----------------------");
    }
}

public class Tareas {

    public static void main(String[] args) {
        ListaTareas misTareas = new ListaTareas();

        misTareas.agregarAlPrincipio("Estudiar Java");
        misTareas.agregarAlPrincipio("Comprar pan");
        misTareas.agregarAlPrincipio("Hacer ejercicio");

        misTareas.mostrarTareas();

        misTareas.marcarComoCompletada("Comprar pan");
        misTareas.mostrarTareas();

        misTareas.eliminarTarea("Hacer ejercicio");
        misTareas.mostrarTareas();

        misTareas.eliminarTareasCompletadas();
        misTareas.mostrarTareas();
    }
}