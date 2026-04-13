package listas_enlazadas_simples.ejer4_monitoreo_industrial;

public class ListaLecturas {

    Lectura cabeza;

    public ListaLecturas() {
        cabeza = null;
    }

    // Agregar al inicio (lo más reciente primero)
    public void agregarLectura(int id, double temp, double presion, String hora) {

        Lectura nueva = new Lectura(id, temp, presion, hora);

        nueva.siguiente = cabeza;
        cabeza = nueva;
    }

    // Mostrar todas
    public void mostrarLecturas() {

        Lectura aux = cabeza;

        while (aux != null) {
            System.out.println("Sensor: " + aux.idSensor +
                               " | Temp: " + aux.temperatura +
                               " | Presión: " + aux.presion +
                               " | Hora: " + aux.hora);
            aux = aux.siguiente;
        }
    }

    // 🔥 Reto: temperatura más alta
    public void mostrarTemperaturaMaxima() {

        if (cabeza == null) {
            System.out.println("No hay lecturas.");
            return;
        }

        Lectura aux = cabeza;
        Lectura max = cabeza;

        while (aux != null) {
            if (aux.temperatura > max.temperatura) {
                max = aux;
            }
            aux = aux.siguiente;
        }

        System.out.println("\n--- MAYOR TEMPERATURA ---");
        System.out.println("Sensor: " + max.idSensor +
                           " | Temp: " + max.temperatura +
                           " | Presión: " + max.presion +
                           " | Hora: " + max.hora);
    }
}