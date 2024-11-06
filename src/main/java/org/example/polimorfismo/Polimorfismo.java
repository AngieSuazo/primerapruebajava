package org.example.polimorfismo;

// Ejemplo de polimorfismo en acción
public class Polimorfismo {
    public static void main(String[] args) {
        TarjetaCreditoPol tarjeta = new TarjetaCreditoPol();
        TarjetaCreditoPol tarjetaPremium = new TarjetaCreditoPremiumPol();

        System.out.println("Interés estándar: " + tarjeta.calcularInteres(1000));
        System.out.println("Interés Premium: " + tarjetaPremium.calcularInteres(1000));
    }
}
