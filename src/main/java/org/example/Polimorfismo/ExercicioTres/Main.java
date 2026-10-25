package org.example.Polimorfismo.ExercicioTres;

public class Main {

    public static void main(String[] args) {

        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 30;
        flora.disciplina = "Java e IA";

        Aluna ana = new Aluna();
        ana.nome = "Ana";
        ana.idade = 25;

        flora.apresentar();
        ana.apresentar();

        flora.lancarNota(ana.nome, 9.5);

        Estagiaria estagiaria = new Estagiaria();

        estagiaria.nome = "Marcia";
        estagiaria.idade = 25;

        Pessoa pessoa = estagiaria;

        pessoa.apresentar();

        mostrarFicha(ana);
        mostrarFicha(flora);
        mostrarFicha(estagiaria);
    }


    /*5. (herança — metodo que recebe a mãe)Crie um metodo na sua classe Main:
    static void mostrarFicha(Pessoa p) {p.apresentar();
   }Chame ele três vezes, passando a aluna, a professora e a estagiária.O metodo não sabe quem vai receber, e funciona pros três.*/

    static void mostrarFicha(Pessoa p) {
        p.apresentar();
    }
}