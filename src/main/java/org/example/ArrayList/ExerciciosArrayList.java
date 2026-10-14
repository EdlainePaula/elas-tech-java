package org.example.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class ExerciciosArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            //Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Carla");
        lista.add("Maria");
        lista.add("Patricia");
        System.out.println(lista);

//- Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.
       /* ArrayList<String> frutas = new ArrayList<>(
        Arrays.asList("Maca", "abacaxi", "abacate", "Morango"));
        System.out.println(frutas.get(0));
        System.out.println(frutas.get(3));
        System.out.println(frutas.size());*/



//- Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.
       /* ArrayList<String> cidades = new ArrayList<>(
        Arrays.asList("São Paulo", "Minas Gerais", "Rio de Janeiro", "Salvador"));
       cidades.remove(1);
        System.out.println(cidades.size());*/

        //- Crie uma lista com seis nomes e imprima todos usando um laço, no formato "0: Ana". (Dica: i + ": " + comando para pegar posição da lista)
 /*ArrayList<String> nomes = new ArrayList<>(
                Arrays.asList("Paulo", "Antonia", "Claudio", "Regina", "Marina", "Suzi"));

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(i + ": " + nomes.get(i));
        }*/

        //Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição. Se não estiver, avise.

       /* ArrayList<String> nomes = new ArrayList<>(
        Arrays.asList("Paulo", "Antonia", "Claudio", "Regina", "Marina"));
         System.out.println("Digite um nome");
        String nome=scanner.nextLine();

        if(nomes.contains(nome)){
            System.out.println("Este nome esta na lista e na posicao " + nomes.indexOf( nome));
        }
        else {
        System.out.println("Este nome não está na lista");

        } */
    }
}
