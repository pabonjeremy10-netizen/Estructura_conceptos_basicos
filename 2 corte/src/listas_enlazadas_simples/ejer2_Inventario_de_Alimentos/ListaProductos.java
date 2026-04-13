package listas_enlazadas_simples.ejer2_Inventario_de_Alimentos;

public class ListaProductos {

    Producto cabeza;

    public ListaProductos() {
        cabeza = null;
    }

    // Agregar según prioridad
    public void agregarProducto(String nombre, int cantidad, int dias) {

        Producto nuevo = new Producto(nombre, cantidad, dias);

        // Si vence pronto → al inicio
        if (dias < 3) {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        } else {
            // Si no → al final
            if (cabeza == null) {
                cabeza = nuevo;
            } else {
                Producto aux = cabeza;
                while (aux.siguiente != null) {
                    aux = aux.siguiente;
                }
                aux.siguiente = nuevo;
            }
        }
    }

    // Mostrar todo
    public void mostrarProductos() {
        Producto aux = cabeza;

        if (aux == null) {
            System.out.println("No hay productos.");
            return;
        }

        while (aux != null) {
            System.out.println("Nombre: " + aux.nombre +
                               " | Cantidad: " + aux.cantidad +
                               " | Días para vencer: " + aux.diasParaVencer);
            aux = aux.siguiente;
        }
    }

    // 🔥 Reto: mostrar los que vencen pronto (<5 días)
    public void mostrarProximosAVencer() {

        Producto aux = cabeza;
        boolean hay = false;

        while (aux != null) {
            if (aux.diasParaVencer < 5) {
                System.out.println("Nombre: " + aux.nombre +
                                   " | Cantidad: " + aux.cantidad +
                                   " | Días: " + aux.diasParaVencer);
                hay = true;
            }
            aux = aux.siguiente;
        }

        if (!hay) {
            System.out.println("No hay productos próximos a vencer.");
        }
    }
}