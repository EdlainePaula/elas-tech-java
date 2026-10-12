package org.example.TratamentoExcecoes;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Excecoes {

        /*1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo. Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando que não dá pra dividir por zero.
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int n1;
            int n2;

            try {
                System.out.println("Digite o primeiro número:");
                n1 = input.nextInt();

                System.out.println("Digite o segundo número:");
                n2 = input.nextInt();

                int resultado = n1 / n2;

                System.out.println("Resultado: " + resultado);

            } catch (ArithmeticException e) {
                System.out.println("Não é possível dividir por zero.");
            }
            */

        /*2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição. Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int[] notas = {4, 5, 9, 8, 10};



            try {
                System.out.println("Escolha uma posição da lista:");
                int resposta = input.nextInt();

                System.out.println("A nota dessa posição é: " + notas[resposta]);


            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: o array só vai de 0 a 4");
            }
          */

        /*3 — Peça a idade da pessoa com scanner.nextInt(). Se ela digitar um texto em vez de um número, trate a InputMismatchException e mostre uma mensagem pedindo um número.
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);



            try {
                System.out.println("Informe sua idade:");
                int idade = input.nextInt();

                System.out.println("Sua idade:  " + idade);


            } catch (InputMismatchException e) {
                System.out.println("A resposta deve ser numerica");
            }

        }
         */


    /*4 — Crie uma variável String nome = null; e tente imprimir nome.length(). Trate a NullPointerException e mostre "O nome não foi preenchido."
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            String name=null;


            try {

                System.out.println(name.length());


            } catch (NullPointerException e) {
                System.out.println("O nome não foi preenchido.");
            }


        }
     */

        /*5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número. Trate a ArithmeticException para o caso de ela digitar 0.
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);


            try {

                System.out.println("Digite um número a ser dividido:");
                int numero = input.nextInt();

                System.out.println("Divisao de " + numero + " e " + (100 % numero));



            } catch (ArithmeticException  e) {
                System.out.println("0 nao eh divisivel");
            }
     */
    /*6 — Crie um array com 3 nomes. Mostre o nome da posição 5 de propósito e trate a ArrayIndexOutOfBoundsException com a mensagem "Essa posição não existe." Depois do try/catch, imprima "O programa continua funcionando."
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            String nome []= {"Caio", "Carla", "Claudia"};

            try {
                System.out.println(nome[5]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Essa posição não existe.");
            }

            System.out.println("O programa continua funcionando.");

        }
     */
}
