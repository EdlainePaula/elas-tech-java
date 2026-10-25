package org.example.Polimorfismo;

public class Calculadora {

    /*1. (mesma classe — muda a QUANTIDADE de parâmetros). Crie a classe Calculadora com TRÊS métodos chamados calcularArea():
      - recebe um double (lado do quadrado)  -> lado * lado
      - recebe dois double (base e altura)   -> base * altura
      - recebe um int (raio do círculo)      -> 3.14159 * raio * raio*/

    /*
    public double calcularArea(double lado) {
        return lado * lado;
    }

    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    public double calcularArea(int raio) {
        return 3.14159 * raio * raio;
    }
    */


    /*2. (mesma classe — muda o TIPO do parâmetro)
    Crie a classe Painel com QUATRO métodos chamados exibir, cada um
    recebendo um tipo diferente: String, int, boolean e double.
    Cada um imprime de um jeito, dizendo que tipo recebeu.
    */

    public void exibir(String texto) {
        System.out.println("Recebi uma String: " + texto);
    }

    public void exibir(int numero) {
        System.out.println("Recebi um int: " + numero);
    }

    public void exibir(boolean valor) {
        System.out.println("Recebi um boolean: " + valor);
    }

    public void exibir(double numero) {
        System.out.println("Recebi um double: " + numero);
    }
}