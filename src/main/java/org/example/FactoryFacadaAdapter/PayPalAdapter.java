package org.example.FactoryFacadaAdapter;

public class PayPalAdapter implements Pagamento {

    private PayPalAPI paypal;

    public PayPalAdapter() {
        paypal = new PayPalAPI();
    }

    @Override
    public void pagar() {
        paypal.sendPayment();
    }
}