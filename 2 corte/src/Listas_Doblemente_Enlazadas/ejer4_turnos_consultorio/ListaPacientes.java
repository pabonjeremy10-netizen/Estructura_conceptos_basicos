package Listas_Doblemente_Enlazadas.ejer4_turnos_consultorio;
public class ListaPacientes {

    Paciente cabeza;
    Paciente cola;

    public ListaPacientes() {
        cabeza = null;
        cola = null;
    }

    public void agregarPaciente(String nombre, int edad, int urgencia) {

        Paciente nuevo = new Paciente(nombre, edad, urgencia);

        // Caso lista vacía
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        }

        else if (urgencia == 5) {

            nuevo.siguiente = cabeza.siguiente;
            nuevo.anterior = cabeza;

            if (cabeza.siguiente != null) {
                cabeza.siguiente.anterior = nuevo;
            }

            cabeza.siguiente = nuevo;

            if (cola == cabeza) {
                cola = nuevo;
            }
        }

        else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    public void mostrarPacientes() {

        Paciente aux = cabeza;

        while (aux != null) {
            System.out.print("[" + aux.nombre +
                             " | Edad: " + aux.edad +
                             " | Urgencia: " + aux.nivelUrgencia + "]");

            if (aux.siguiente != null) {
                System.out.print(" <-> ");
            }

            aux = aux.siguiente;
        }

        System.out.println();
    }

    public void mostrarMayorEdad() {

        if (cola == null) {
            System.out.println("No hay pacientes.");
            return;
        }

        Paciente aux = cola;
        Paciente mayor = cola;

        while (aux != null) {
            if (aux.edad > mayor.edad) {
                mayor = aux;
            }
            aux = aux.anterior;
        }

        System.out.println("\n--- PACIENTE DE MAYOR EDAD ---");
        System.out.println("Nombre: " + mayor.nombre +
                           " | Edad: " + mayor.edad +
                           " | Urgencia: " + mayor.nivelUrgencia);
    }
}
