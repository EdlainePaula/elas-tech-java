package org.example.aula1;

public class ConcatenacaoOperadores{
    public static void main(String[] args) {
        String nome = "Ana"; String cidade = "Salvador"; int idade = 28;
        System.out.println("Meu nome é " + nome + ", moro em " + cidade + " e tenho " + idade + " anos.");

        String produto = "Caneca"; double preco = 12.5; int qtd = 4;
        System.out.println("Comprei " + qtd + " unidades de " + produto + " por R$ " + preco + " cada. Total: R$ " + (preco*qtd));

        int n1 = 15, n2 = 4;
        System.out.println("A soma de " + n1 + " e " + n2 + " é igual a " + (n1+n2));
        System.out.println("2 + 2 = " + 2 + 2);
        System.out.println("2 + 2 = " + (2 + 2));

        int a = 10, b = 3;
        System.out.println("Soma: " + (a+b));
        System.out.println("Subtração: " + (a-b));
        System.out.println("Multiplicação: " + (a*b));
        System.out.println("Divisão: " + (a/b));
        System.out.println("Resto: " + (a%b));

        double x = 10, y = 3;
        System.out.println("Soma: " + (x+y));
        System.out.println("Subtração: " + (x-y));
        System.out.println("Multiplicação: " + (x*y));
        System.out.println("Divisão: " + (x/y));
        System.out.println("Resto: " + (x%y));

        int nota1 = 8, nota2 = 6, nota3 = 10;
        System.out.println("Soma: " + (nota1+nota2+nota3) + " | Média: " + ((nota1+nota2+nota3)/3.0));

        int c = 5;
        System.out.println("a + b * c = " + (a + b * c));
        System.out.println("(a + b) * c = " + ((a + b) * c));

        int segundos = 3785;
        System.out.println(segundos + " segundos = " + (segundos/60) + " minutos e " + (segundos%60) + " segundos.");
    }
}