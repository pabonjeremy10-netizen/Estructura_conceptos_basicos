/*ejercicio 7
Inventario compartido Un almacén tiene un arreglo con el stock de 5 productos.
El sistema de ventas y el sistema de reportes apuntan al mismo arreglo.
Crea el arreglo stockAlmacen con valores iniciales. 
Asigna stockReportes = stockAlmacen. Simula una venta reduciendo el stock de un producto desde stockReportes. 
Muestra que stockAlmacen también cambió y explica en comentarios por qué.
*/
    public class Inventario_Compartido {

    public static void main(String[] args) {

        int[] stockAlmacen = {50, 30, 20, 15, 10};

        int[] stockReportes = stockAlmacen;

        System.out.println("Stock inicial:");
        mostrarStock(stockAlmacen);

        stockReportes[1] -= 5;

        System.out.println("\nDespués de la venta (modificado desde stockReportes):");

        System.out.println("Stock Almacén:");
        mostrarStock(stockAlmacen);

        System.out.println("Stock Reportes:");
        mostrarStock(stockReportes);

        /*
         EXPLICACIÓN:
         stockReportes = stockAlmacen NO crea una copia del arreglo.
         Ambos apuntan al mismo espacio de memoria.

         En Java, los arreglos son tipos por referencia.
         Por eso, cuando se modifica stockReportes,
         también cambia stockAlmacen automáticamente.
        */
    }

    public static void mostrarStock(int[] stock) {
        for (int cantidad : stock) {
            System.out.print(cantidad + " ");
        }
        System.out.println();
    }
}
