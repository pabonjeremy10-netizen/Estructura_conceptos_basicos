public class Conversor_de_unidades {
    
     public static void main(String[] args) {

        double tazas = 3.5;
        double mililitros;
        double litros;

        mililitros = tazas * 236.588;
        litros = mililitros / 1000;

        System.out.println("=== Conversor de Unidades ===");
        System.out.println("Tazas: " + tazas);
        System.out.println("Mililitros: " + mililitros + " ml");
        System.out.println("Litros: " + litros + " L");
    }
}
