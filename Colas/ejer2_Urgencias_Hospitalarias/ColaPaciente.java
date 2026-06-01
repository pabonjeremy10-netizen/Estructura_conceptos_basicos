package Colas.ejer2_Urgencias_Hospitalarias;

public class ColaPaciente {

    private Paciente entrada;
    private Paciente salida;
    private int tamanio;

    public ColaPaciente() {

        this.entrada = null;
        this.salida = null;
        this.tamanio = 0;
    }

    // Verifica si la cola está vacía
    public boolean isEmpty() {

        return salida == null;
    }

    // Retorna el tamaño
    public int size() {

        return tamanio;
    }

    // Consultar el primer paciente sin eliminarlo
    public Paciente peek() {

        if (isEmpty()) {

            System.out.println("La cola está vacía.");
            return null;
        }

        return salida;
    }

    // Insertar paciente
    public void enqueue(Paciente paciente) {

        if (isEmpty()) {

            salida = paciente;
            entrada = paciente;

        } else {

            entrada.siguiente = paciente;
            entrada = paciente;
        }

        tamanio++;
    }

    // Atender paciente
    public Paciente dequeue() {

        if (isEmpty()) {

            System.out.println("La cola está vacía.");
            return null;
        }

        Paciente paciente = salida;

        salida = salida.siguiente;

        if (salida == null) {

            entrada = null;
        }

        tamanio--;

        return paciente;
    }

    // Mostrar cola
    public void imprimir() {

        if (isEmpty()) {

            System.out.println("[ Cola vacía ]");
            return;
        }

        System.out.print("SALIDA -> ");

        Paciente actual = salida;

        while (actual != null) {

            System.out.print("[" + actual.nombreCompleto + " - " + actual.sintomaPrincipal + "]");

            if (actual.siguiente != null) {

                System.out.print(" -> ");
            }

            actual = actual.siguiente;
        }

        System.out.println(" -> ENTRADA");
    }

    // Atender todos los pacientes
    public void atenderTodos() {

        if (isEmpty()) {

            System.out.println("No hay pacientes en espera.");
            return;
        }

        int contador = 0;

        System.out.println("\n===== INICIO DE ATENCION =====");

        while (!isEmpty()) {

            Paciente atendido = dequeue();

            System.out.println("\nPaciente Atendido:");
            System.out.println("Cedula: " + atendido.cedula);
            System.out.println("Nombre: " + atendido.nombreCompleto);
            System.out.println("Edad: " + atendido.edad);
            System.out.println("Sintoma Principal: " + atendido.sintomaPrincipal);

            contador++;
        }

        System.out.println("\n===== FIN DEL TURNO =====");
        System.out.println("Total de pacientes atendidos: " + contador);
    }
}
