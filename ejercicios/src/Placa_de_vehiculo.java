import java.util.Scanner;

public class Placa_de_vehiculo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String placa;
        int añofabricacion;
        int cilindraje;
        double precio;
        char Color;
        boolean soat;

        System.out.print("Ingrese la placa del vehículo: ");
        placa = scanner.nextLine();

        System.out.print("Ingrese el año de fabricación: ");
        añofabricacion = scanner.nextInt();

        System.out.print("Ingrese el cilindraje (cc): ");
        cilindraje = scanner.nextInt();

        System.out.print("Ingrese el precio de compra: ");
        precio = scanner.nextDouble();

        System.out.print("Ingrese la inicial del color: ");
        Color = scanner.next().charAt(0);

        System.out.print("¿Tiene SOAT vigente? (true/false): ");
        soat = scanner.nextBoolean();

        System.out.println("\n=== Datos del Vehículo ===");
        System.out.println("Placa: " + placa);
        System.out.println("Año de fabricación: " + añofabricacion);
        System.out.println("Cilindraje: " + cilindraje + " cc");
        System.out.println("Precio de compra: $" + precio);
        System.out.println("Inicial del color: " + Color);
        System.out.println("SOAT vigente: " + soat);

        scanner.close();
    }
}