package listas_circulares_dobles.ejer2_Historial_de_Comandos_de_Terminal;

public class Historial {
    Nodo cabeza;
    Nodo cola;
    Nodo cursor;

    public Historial() {
        cabeza = null;
        cola = null;
        cursor = null;
    }

    public boolean estaVacio() {
        return cabeza == null;
    }

    public void agregarComando(String texto, boolean exitoso, String directorio) {
        Nodo nuevo = new Nodo(texto, exitoso, directorio);

        if (cabeza == null) {
            nuevo.siguiente = nuevo;
            nuevo.anterior = nuevo;
            cabeza = cola = cursor = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cola = nuevo;
        }
    }
            
            public void arriba() {
        if (cursor != null) {
            cursor = cursor.anterior;
        }
        }
        public void abajo() {
        if (cursor != null) {
        cursor = cursor.siguiente;
        }
        }
        public void mostrarCursor() {
            if (cursor == null) {
                System.out.println("Historial vacío.");
                return;
            }

            System.out.println("> " + cursor.texto +
                    " [" + (cursor.exitoso ? "OK" : "ERROR") + "]" +
                    " (" + cursor.directorio + ")");
                }
                public void eliminarActual() {
            if (cursor == null) return;

            if (cursor == cabeza && cursor == cola) {
                cabeza = cola = cursor = null;
                return;
            }

            cursor.anterior.siguiente = cursor.siguiente;
            cursor.siguiente.anterior = cursor.anterior;

            if (cursor == cabeza) cabeza = cursor.siguiente;
            if (cursor == cola) cola = cursor.anterior;

            cursor = cursor.siguiente;
                }
                public void mostrarHistorial() {
            if (estaVacio()) {
                System.out.println("Historial vacío.");
                return;
            }

            Nodo actual = cabeza;
            int i = 1;

            do {
                String marca = (actual == cursor) ? " <-- cursor" : "";

                System.out.println(i + ". " + actual.texto +
                        " [" + (actual.exitoso ? "OK" : "ERROR") + "]" +
                        " (" + actual.directorio + ")" + marca);

                actual = actual.siguiente;
                i++;
            } while (actual != cabeza);
        }
        }
