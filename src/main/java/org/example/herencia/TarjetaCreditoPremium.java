package org.example.herencia;

public class TarjetaCreditoPremium extends TarjetaCreditoHer {
    private double recompensas;

    public TarjetaCreditoPremium(double limiteCredito, double recompensas) {
        super(limiteCredito);
        this.recompensas = recompensas;
    }
}
