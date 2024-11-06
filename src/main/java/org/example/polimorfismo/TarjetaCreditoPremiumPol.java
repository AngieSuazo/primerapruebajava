package org.example.polimorfismo;

public class TarjetaCreditoPremiumPol extends TarjetaCreditoPol {
    @Override
    public double calcularInteres(double saldo) {
        return saldo * 0.02; // Interés del 2% para Premium
    }
}
