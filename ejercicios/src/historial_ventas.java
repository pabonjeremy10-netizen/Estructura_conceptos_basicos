/*ejercicio 12
    Historial de ventas (lineal)
Una tienda online guarda las ventas del día en un arreglo de double:

Almacena 7 ventas de ejemplo.
Calcula e imprime: la venta más alta, la venta más baja y el total del día.
*/
public class historial_ventas {
    public static void main(String[] args) {
        double[] ventas = {150.50, 200.00, 75.30, 320.75, 180.20, 95.40, 250.10};
        
        System.out.println("=== HISTORIAL DE VENTAS DEL DÍA ===\n");
        
        System.out.println("Ventas registradas:");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Venta #" + (i + 1) + ": $" + ventas[i]);
        }
        
        double ventaAlta = ventas[0]; 
        
        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > ventaAlta) {
                ventaAlta = ventas[i];
            }
        }
        

        double ventaBaja = ventas[0]; 
        
        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] < ventaBaja) {
                ventaBaja = ventas[i];
            }
        }
        
        double total = 0;
        
        for (int i = 0; i < ventas.length; i++) {
            total = total + ventas[i]; 
        }
        
        System.out.println("\n=== RESUMEN DEL DÍA ===");
        System.out.println("Venta más alta: $" + ventaAlta);
        System.out.println("Venta más baja: $" + ventaBaja);
        System.out.println("Total del día: $" + total);
        System.out.println("Cantidad de ventas: " + ventas.length);
        
        double promedio = total / ventas.length;
        System.out.println("Promedio por venta: $" + promedio);
    }
}
