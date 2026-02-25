import java.util.Scanner;

public class Sensor_de_temperatura {

    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);

        double temperatura;
        String nombre;
        int Lectura;
        boolean enAlarma;

        System.out.print("Ingrese el nombre del sensor: ");
        nombre = datos.nextLine();

        System.out.print("Ingrese el número de lectura: ");
        Lectura = datos.nextInt();

        System.out.print("Ingrese la temperatura actual en °C: ");
        temperatura = datos.nextDouble();

        enAlarma = temperatura > 80;

        System.out.println("\n=== Estado del Sensor ===");
        System.out.println("Nombre del sensor: " + nombre);
        System.out.println("Número de lectura: " + Lectura);
        System.out.println("Temperatura actual: " + temperatura + " °C");
        System.out.println("En alarma: " + enAlarma);
    }
}