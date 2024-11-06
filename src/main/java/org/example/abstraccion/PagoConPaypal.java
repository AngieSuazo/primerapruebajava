package org.example.abstraccion;

public class PagoConPaypal implements Pago {
    @Override
    public void procesarPago(double monto) {

        System.out.println("Procesando pago con PayPal: " + monto);
    }
}
