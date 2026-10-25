package org.example.Polimorfismo.Interface;


/*6. (interfaace)
    Crie a interfaace MeioDePagamento com pagar(double valor).Crie Pix e Boleto implementando ela, cada uma imprimindo uma
   mensagem diferente com printf e %.2f. Declare UMA variável do tipo da interfaace: MeioDePagamento forma;
   forma = new Pix()forma.pagar(150.00);
   forma = new Boleto();forma.pagar(150.00);*/

public interface MeioDePagamento {

        void pagar(double valor);
}
