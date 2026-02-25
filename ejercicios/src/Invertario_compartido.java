public class Invertario_compartido {

    public static void main(String[] args) {

        int[] stock = {10, 20, 15, 8, 30};

        int[] stockReportes = stock;

        stockReportes[1] = stockReportes[1] - 5;

        System.out.println("Stock desde almacén:");
        for (int i = 0; i < stock.length; i++) {
            System.out.println("Producto " + i + ": " + stock[i]);
        }

        System.out.println("\nStock desde reportes:");
        for (int i = 0; i < stockReportes.length; i++) {
            System.out.println("Producto " + i + ": " + stockReportes[i]);
        }

        /*
         Aquí sí cambia todo porque los arreglos en Java NO se copian como los int.
         Cuando hacemos:
         
         int[] stockReportes = stockAlmacen;
         
         No se crea un arreglo nuevo.
         Los dos están apuntando al mismo arreglo en memoria.
         
         Entonces cuando cambiamos stockReportes[1],
         en realidad estamos cambiando el mismo arreglo que usa stockAlmacen.
         
         O sea, no hay copia… están compartiendo la misma cosa.
        */
    }
}