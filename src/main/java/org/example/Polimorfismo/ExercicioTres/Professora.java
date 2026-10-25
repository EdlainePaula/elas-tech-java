package org.example.Polimorfismo.ExercicioTres;

/*3. Crie a classe Professora, também filha de Pessoa, com o atributo,disciplina e o metodo lancarNota(String aluna, double nota), que
imprime algo como "Flora lançou nota 9.5 para Ana". Use printf
com %.1f.Na Main, crie uma aluna e uma professora e dê valor aos atributos
de cada objeto:Professora flora = new Professora();flora.nome = "Flora";flora.idade = 30;
flora.disciplina = "Java e IA";Faça o mesmo com a aluna e chame os métodos das duas.*/

public class Professora extends Pessoa {

    String disciplina;

    public void lancarNota(String aluna, double nota) {
        System.out.printf("%s lançou nota %.1f para %s%n", nome, nota, aluna);
    }
}