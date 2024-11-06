package org.example.encapsulamiento;

public class TarjetaCreditoEncap {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void realizarCompra(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }
}
