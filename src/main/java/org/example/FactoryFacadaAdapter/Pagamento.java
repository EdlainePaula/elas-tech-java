package org.example.FactoryFacadaAdapter;


/* Questão 6 (prática). O seu sistema usa esta interface:
public interface Pagamento {
    void pagar();
}
Você recebeu esta classe de outra empresa. Ela não pode ser alterada:
public class PayPalAPI {
    public void sendPayment() {
        System.out.println("Pagamento enviado pelo PayPal.");
    }
}
Crie a classe PayPalAdapter, para que o sistema consiga usar o PayPal como um Pagamento. Não precisa fazer nenhuma conversão: o método pagar() só precisa chamar o método da classe de fora.
No main:
1. Escreva, como comentário, a linha que tentaria usar PayPalAPI direto como Pagamento (a que não compila).
2. Crie uma variável do tipo Pagamento usando o adapter e chame pagar().*/

public interface Pagamento {
    void pagar();
}