package org.example.Polimorfismo;
import org.example.Polimorfismo.Calculadora;

public class ExerciciosPolimorfismo {
    /*public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.calcularArea(5.0));*/


        public static void main(String[] args) {

            Calculadora calculadora = new Calculadora();

            calculadora.exibir("Olá");
            calculadora.exibir(10);
            calculadora.exibir(true);
            calculadora.exibir(7.5);
        }
}


