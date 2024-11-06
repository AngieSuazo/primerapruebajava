package org.example.abstraccion;

public class Main {
    public static void main(String[] args) {
        Pago pagoTarjeta = new PagoConTarjeta();
        Pago pagoPaypal = new PagoConPaypal();

        pagoTarjeta.procesarPago(500);
        pagoPaypal.procesarPago(300);
    }
}
