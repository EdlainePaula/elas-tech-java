package org.example.ForEach;

class ForEachExercicios {
    public static void main(String[] args) {
        //1. Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each,um por linha.

        /*String [] nomes ={"Caio", "Paulo", "Ana", "Sofia"};

        for (String nome : nomes) {
        System.out.println(nome);

        }*/


//2. Crie um ArrayList com 5 notas e imprima todas usando for-each.

        /*int[] notas={7,6,9,5,1};
        for (int nota : notas) {
        System.out.println(nota);

        }*/

//3. Com o array de notas {8, 6, 10, 7}, use for-each para somar todas e mostrar a soma e a média.
        /*int [] notas= {8, 6, 10, 7};

        double soma =0;
        double media;
        for (int nota : notas) {
            soma += nota;

        }
        media = soma / notas.length;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);*/

//4. Com um array de nomes, use for-each e um if para contar quantos têm mais de 5 letras. Mostre o total. Dica: usem o método length.

    /*int contador=0;
       String [] nomes ={"Caio", "Marilia", "Andressa", "Cesar", "Joana"};
           for (String nome : nomes){
               if (nome.length() >5){
                   contador++;
               }
           }
         System.out.println(contador);*/
        //5. Pegue o exercício 1 e escreva ele DE NOVO com o for normal,usando o índice. Deixe os dois na mesma classe e compare.


        String [] nomes ={"Caio", "Paulo", "Ana", "Sofia"};
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}