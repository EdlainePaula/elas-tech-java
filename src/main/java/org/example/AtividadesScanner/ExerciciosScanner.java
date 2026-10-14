package org.example.AtividadesScanner;
import java.util.Scanner;

public class ExerciciosScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1 - Peça o nome da pessoa e a idade dela. Exemplo: "Oi Ana, você tem 28 anos e vai fazer 29 no próximo aniversário."
    System.out.println("Digite o seu nome");
        String nome= scanner.nextLine();
    System.out.println("E a sua idade?");
        int idade= scanner.nextInt();

    int aniversario= (idade + 1);

    System.out.println("Oi, " + nome + "! você tem " + idade + " anos e vai fazer " + aniversario + " no próximo aniversário.");

        //2 - Peça dois números inteiros e mostre a soma, a subtração, a multiplicação, a divisão e o resto.


        /*System.out.println("Digite um numero");
        int num1 = scanner.nextInt();

        System.out.println("Digite outro numero");
        int num2 = scanner.nextInt();


        System.out.println("A soma dos numeros é " + (num1 + num2));
        System.out.println("A subtração dos numeros é " + (num1 - num2));
        System.out.println("A multiplicação dos numeros é " + (num1 * num2));
        System.out.println("A divisão dos numeros é " + (num1 / num2));
        System.out.println("O resto dos numeros é " + (num1 % num2));*/

        // 3 - Peça a nota de uma aluna e mostre se ela foi aprovada (7 ou mais), ficou de recuperação (entre 5 e 6.9) ou foi reprovada.

        /*System.out.println("Digite sua nota");

        double nota = scanner.nextDouble();

        if (nota >=7){
            System.out.println("Parabéns, você foi aprovado(a)");
        } else if (nota <= 6.9){
            System.out.println("Você foi reprovado(a)");
        }*/

        //4 - Peça um número e mostre a tabuada dele de 1 a 10.

        /* System.out.println("Vamos conhecer a taboada de 1 a 10, digite um número inteiro: ");
           int numero = scanner.nextInt();
            int i = 1;

        while (i <= 10) {

            System.out.println(numero + " x " + i + " = " + (numero * i) );

                i++;


        }  */


    }
}