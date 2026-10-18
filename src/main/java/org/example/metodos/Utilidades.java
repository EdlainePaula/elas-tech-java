package org.example.metodos;

import java.util.Scanner;

public class Utilidades {

    // Exercicio 1

    public static void mostrarBoasVindas() {
        System.out.println("Bem-vinda ao curso de Java!");
    }

    // Exercício 2
    public static void saudar(String nome) {
        System.out.println("Olá, " + nome + "! Tudo bem?");
    }

    // Exercício 3
    public static int dobro(int numero) {
        return numero * 2;
    }

    // Exercício 4
    public static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    // Exercício 5
    public static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }
}