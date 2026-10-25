package org.example.exercicioencapsulamento;

public class ContaBancaria {

    private String titular;
    private double saldo;
    private String numeroConta = "001-X";

    // ATIVIDADE 2 - GETTERS

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // ATIVIDADE 3 - SETTER

    public void setTitular(String titular) {

        if (titular == null || titular.isEmpty()) {
            System.out.println("Titular inválido! Mantido " + this.titular);
            return;
        }

        this.titular = titular;
    }

    // ATIVIDADE 4 - DEPOSITAR E SACAR

    public void depositar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;
        }

        saldo += valor;
        registrarLog("deposito de " + valor);
    }

    public void sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;
        }

        if (!temSaldo(valor)) {
            System.out.println("Saldo insuficiente!");
            return;
        }

        saldo -= valor;
        registrarLog("saque de " + valor);
    }

    private boolean temSaldo(double valor) {
        return saldo >= valor;
    }

    private void registrarLog(String acao) {
        System.out.println("[LOG] " + titular + ": " + acao);
    }

    // ATIVIDADE 6 - GETTER SEM SETTER

    public String getNumeroConta() {
        return numeroConta;
    }
}