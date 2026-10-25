package org.example.exercicioencapsulamento;

public class Main {

    public static void main(String[] args) {

        // 1. (sentir o private na pele) Crie a classe ContaBancaria com os atributos titular (String) e saldo (double), os DOIS private.

        ContaBancaria c1 = new ContaBancaria();

        // System.out.println(c1.titular);
        // c1.saldo = -5000;

        System.out.println("Os atributos são privados e não podem ser acessados diretamente.");

        // 2. (abrir a porta de leitura) Crie um getter para cada atributo. Na Main, apague as duas linhas que davam erro e mostre o titular e o saldo usando os getters.

        ContaBancaria c2 = new ContaBancaria();

        System.out.println("Titular: " + c2.getTitular());
        System.out.println("Saldo: " + c2.getSaldo());


        // 3. (a porta de escrita, com porteiro) Crie um setter para o titular que RECUSA valor vazio. Se vier vazio, avisa e mantém o que já estava.

        ContaBancaria c3 = new ContaBancaria();

        c3.setTitular("");
        c3.setTitular("Ana");

        System.out.println("Titular: " + c3.getTitular());

        // 4. (métodos que fazem o trabalho sujo) Crie na ContaBancaria: PÚBLICOS: - depositar(double valor)   -> recusa valor menor ou igual a zero - sacar(double valor)       -> recusa se não tiver saldo PRIVADOS: - temSaldo(double valor)    -> devolve true ou false - registrarLog(String acao) -> imprime "[LOG] Ana: saque de 200.0" O sacar() usa o temSaldo() pra decidir, e os dois chamam o registrarLog() quando dá certo. Na Main: deposite 500, tente depositar -100, tente sacar 2000, saque 200.

        ContaBancaria c4 = new ContaBancaria();

        c4.setTitular("Ana");

        c4.depositar(500);
        System.out.println("Saldo: " + c4.getSaldo());

        c4.depositar(-100);

        c4.sacar(2000);

        c4.sacar(200);
        System.out.println("Saldo: " + c4.getSaldo());

        // c4.registrarLog("teste");


        // 5. (os modificadores lado a lado) Crie a classe Produto com TRÊS atributos, cada um com um modificador diferente: private String codigoInterno = "X-99"; String nome = "Caneta; sem modificador: default public double preco = 5.50; Na Main (mesmo package), tente imprimir os três. Quais funcionaram? Qual deu erro?

        Produto p = new Produto();

        System.out.println(p.nome);
        System.out.println(p.preco);

        // System.out.println(p.codigoInterno);

        // 6. (nem todos atributos precisam de setter) Na ContaBancaria, acrescente o atributo numeroConta, private, já com um valor fixo: private String numeroConta = "001-X"; Crie o GETTER dele. NÃO crie o setter. Na Main, mostre o número da conta. Depois tente mudar ele: c.setNumeroConta("999-Z");

        ContaBancaria c6 = new ContaBancaria();

        System.out.println("Numero da conta: " + c6.getNumeroConta());

        // c6.setNumeroConta("999-Z");

    }
}