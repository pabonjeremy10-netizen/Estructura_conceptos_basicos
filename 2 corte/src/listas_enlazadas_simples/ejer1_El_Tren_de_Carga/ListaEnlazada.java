package listas_enlazadas_simples.ejer1_El_Tren_de_Carga;
public class ListaEnlazada {

    Vagon cabeza;

    public ListaEnlazada() {
        cabeza = null;
    }

    public void agregarVagon(String contenido, double peso, String origen, String destino) {

        Vagon nuevo = new Vagon(contenido, peso, origen, destino);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Vagon aux = cabeza;

            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }

            aux.siguiente = nuevo;
        }
    }

    public double calcularPesoTotal() {

        double total = 0;
        Vagon aux = cabeza;

        while (aux != null) {
            total += aux.pesoToneladas;
            aux = aux.siguiente;
        }

        return total;
    }

    public void mostrarTren() {

        if (cabeza == null) {
            System.out.println("El tren está vacío.");
            return;
        }

        Vagon aux = cabeza;

        while (aux != null) {
            System.out.println("Contenido: " + aux.contenido +
                    " | Peso: " + aux.pesoToneladas +
                    " | Origen: " + aux.origen +
                    " | Destino: " + aux.destino);
            aux = aux.siguiente;
        }
    }
}
