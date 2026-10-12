package org.example.metodos;
public class MetodosJava {

    public static void main(String[] args) {

        // Exercício 1
        mostrarBoasVindas();

        // Exercício 2
        Utilidades.saudar("Ana");
        Utilidades.saudar("Maria");
        Utilidades.saudar("Caio");
    }

    public static void mostrarBoasVindas() {
        System.out.println("Bem-vinda ao curso de Java!");
    }
}

class Utilidades {

    public static void saudar(String nome) {
        System.out.println("Olá, " + nome + "! Tudo bem?");
    }
}