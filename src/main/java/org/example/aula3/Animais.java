package org.example.aula3;
import java.util.Scanner;

public class Animais {
    String cor;
    int idade;
    double peso;
    boolean castrado;
    public static void main(String[] args) {
        Scanner coisinha = new Scanner(System.in);
        String nome;

        System.out.println("Escreva seu nome: ");
        nome = coisinha.nextLine();

        System.out.println("Seu nome é: " + nome);
    }
}

