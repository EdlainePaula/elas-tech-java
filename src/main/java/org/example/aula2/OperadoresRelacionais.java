package org.example.aula2;

import java.util.Scanner;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // ==================== QUESTÃO 1 ====================

        /*
        1 — Crie uma variável idade e mostre a categoria de uma pessoa:
        menos de 13 anos é "Criança", de 13 a 17 é "Adolescente",
        de 18 a 59 é "Adulto" e 60 ou mais é "Idoso".
        */

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        if (idade < 13) {
            System.out.println("Criança");
        }
        else if (idade >= 13 && idade <= 17) {
            System.out.println("Adolescente");
        }
        else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto");
        }
        else if (idade >= 60) {
            System.out.println("Idoso");
        }
        else {
            System.out.println("Digite um valor válido");
        }


        // ==================== QUESTÃO 2 ====================

        /*
        2 — Crie variáveis para o saldo da conta (R$ 500.00)
        e o valor de uma compra (R$ 320.00).
        */

        double saldo = 500.00;
        double compra = 320.00;

        if (saldo >= compra) {
            System.out.println("Compra aprovada! Saldo atual R$ " + (saldo - compra));
        }
        else {
            System.out.println("Saldo insuficiente! Faltam R$ " + (compra - saldo));
        }


        // ==================== QUESTÃO 3 ====================

        /*
        3 — Usando switch, mostre o pedido escolhido no cardápio.
        */

        System.out.print("Digite uma opção de 1 a 4: ");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Café");
                break;

            case 2:
                System.out.println("Cappuccino");
                break;

            case 3:
                System.out.println("Chocolate quente");
                break;

            case 4:
                System.out.println("Chá");
                break;

            default:
                System.out.println("Opção inválida");
        }


        // ==================== QUESTÃO 4 ====================

        /*
        4 — Crie variáveis idade (17) e temAutorizacao (true).
        */

        idade = 17;
        boolean temAutorizacao = true;

        // 18 anos OU autorização

        if (idade >= 18 || temAutorizacao) {
            System.out.println("Pode entrar na festa");
        }
        else {
            System.out.println("Não pode entrar na festa");
        }

        // 18 anos E autorização

        if (idade >= 18 && temAutorizacao) {
            System.out.println("Pode entrar na festa");
        }
        else {
            System.out.println("Não pode entrar na festa");
        }


        // ==================== DESAFIO ====================

       /* Desafio: Crie variáveis para três notas de uma aluna. Calcule a média e mostre: "Aprovada" se for 7 ou mais, "Recuperação" entre 5 e 6.9, e "Reprovada" abaixo de 5. Mostre também a média na tela. Valores: nota1 = 5.3, nota2 = 7.8 , nota3 = 4.5.*/

        double nota1 = 5.3;
        double nota2 = 7.8;
        double nota3 = 4.5;

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média é: %.2f\n", media);

        if (media >= 7) {
            System.out.println("Aprovada");
        }
        else if (media >= 5 && media < 7) {
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovada");
        }

    }
}