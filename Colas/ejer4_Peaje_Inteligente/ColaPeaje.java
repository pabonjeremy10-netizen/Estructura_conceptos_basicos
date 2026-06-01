package Colas.ejer4_Peaje_Inteligente;

public class ColaPeaje {

    private Vehiculo entrada;
    private Vehiculo salida;
    private int tamanio;

    public ColaPeaje() {

        this.entrada = null;
        this.salida = null;
        this.tamanio = 0;
    }

    public boolean isEmpty() {

        return salida == null;
    }

    public int size() {

        return tamanio;
    }

    public Vehiculo peek() {

        if (isEmpty()) {

            System.out.println("La cola está vacía.");
            return null;
        }

        return salida;
    }

    public void enqueue(Vehiculo vehiculo) {

        if (isEmpty()) {

            salida = vehiculo;
            entrada = vehiculo;

        } else {

            entrada.siguiente = vehiculo;
            entrada = vehiculo;
        }

        tamanio++;
    }

    public Vehiculo dequeue() {

        if (isEmpty()) {

            System.out.println("La cola está vacía.");
            return null;
        }

        Vehiculo vehiculo = salida;

        salida = salida.siguiente;

        if (salida == null) {

            entrada = null;
        }

        tamanio--;

        return vehiculo;
    }

    public void imprimir() {

        if (isEmpty()) {

            System.out.println("[ Cola vacía ]");
            return;
        }

        System.out.print("SALIDA -> ");

        Vehiculo actual = salida;

        while (actual != null) {

            System.out.print("["
                + actual.placa
                + " - "
                + actual.tipoVehiculo
                + " - $"
                + actual.tarifa
                + "]");

            if (actual.siguiente != null) {

                System.out.print(" -> ");
            }

            actual = actual.siguiente;
        }

        System.out.println(" -> ENTRADA");
    }

    public void cerrarTurno() {

        double totalRecaudado = 0;

        while (!isEmpty()) {

            Vehiculo vehiculo = dequeue();

            System.out.println("\nVehículo procesado:");
            System.out.println("Placa: " + vehiculo.placa);
            System.out.println("Tipo: " + vehiculo.tipoVehiculo);

            if (!vehiculo.esExento) {

                totalRecaudado += vehiculo.tarifa;
            }
        }

        System.out.println("\nTotal recaudado: $" + totalRecaudado);
    }
}