package org.example.metodos;

import java.util.Scanner;

public class MetodosJava {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //1 — Na mesma classe do main, crie um metodo chamado mostrarBoasVindas() que imprime "Bem-vinda ao curso de Java!". Chame ele no main.
        Utilidades.mostrarBoasVindas();

        // Exercício 2
        Utilidades.saudar("Ana");
        Utilidades.saudar("Carlos");
        Utilidades.saudar("Maria");

        // Exercício 3
        int resultado = Utilidades.dobro(5);
        System.out.println("Dobro: " + resultado);

        // Exercício 4
        System.out.print("Digite a primeira nota: ");
        double n1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = input.nextDouble();

        double media = Utilidades.calcularMedia(n1, n2);
        System.out.printf("Média: %.2f%n", media);

        // Exercício 5
        System.out.print("Digite a idade: ");
        int idade = input.nextInt();

        if (Utilidades.ehMaiorDeIdade(idade)) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        input.close();
    }
}


