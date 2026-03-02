//Calcuadora de una tienda
// tienda de barrio vende productos al por menor. El cajero necesita calcular:
//Precio unitario de un producto (double)
//Cantidad comprada (int)
//Descuento aplicado en porcentaje (double)
//Total a pagar después del descuento
//Declara las variables, realiza el cálculo y muestra el resultado por consol

public class calculadora_de_una_tienda {

    public static void main(String[] args) {

        double precio;
        int cantidad;
        double descuentoXporcentaje;
        double subtotal;
        double total;

        precio = 2500.0;     
        cantidad = 4;        
        descuentoXporcentaje = 10.0;  

        subtotal = precio * cantidad;
        total = subtotal - (subtotal * (descuentoXporcentaje / 100));

        System.out.println("=== Factura ===");
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Descuento: " + descuentoXporcentaje + "%");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Total a pagar: $" + total);
    }
}
