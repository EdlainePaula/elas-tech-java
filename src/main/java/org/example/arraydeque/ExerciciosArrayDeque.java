package arraydeque;

import java.util.ArrayDeque;

public class ExerciciosArrayDeque {

    public static void main(String[] args) {

        // 1. Crie uma fila e coloque três pessoas nela com add. Imprima a fila e quantas pessoas tem.

        /*ArrayDeque<String> fila1 = new ArrayDeque<>();

        fila1.add("Ana");
        fila1.add("Bia");
        fila1.add("Carlos");

        System.out.println("Fila: " + fila1);
        System.out.println("Quantidade de pessoas: " + fila1.size()); */

        // 2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e imprima a fila logo depois. Repare que ela não mudou.

        /* ArrayDeque<String> fila2 = new ArrayDeque<>();

        fila2.add("Ana");
        fila2.add("Bia");
        fila2.add("Carlos");

        System.out.println("Próximo da fila: " + fila2.peek());
        System.out.println("Fila depois do peek: " + fila2); */

        // 3. Mesma fila. Agora use poll para atender o primeiro e imprima a fila depois. Compare com o exercício 2.

        /* ArrayDeque<String> fila3 = new ArrayDeque<>();

        fila3.add("Ana");
        fila3.add("Bia");
        fila3.add("Carlos");

        System.out.println("Atendendo: " + fila3.poll());
        System.out.println("Fila depois do poll: " + fila3); */

        // 4. Crie uma fila com três nomes e atenda todos usando while (!fila.isEmpty()). No final, imprima "Fila vazia!".

        /* ArrayDeque<String> fila4 = new ArrayDeque<>();

        fila4.add("Ana");
        fila4.add("Bia");
        fila4.add("Carlos");

        while (!fila4.isEmpty()) {
            System.out.println("Atendendo: " + fila4.poll());
        }

        System.out.println("Fila vazia!"); */

        // 5. Crie uma fila com três nomes e use contains para responder duas perguntas: se "Bia" está na fila e se "Zoe" está.

        /* ArrayDeque<String> fila5 = new ArrayDeque<>();

        fila5.add("Ana");
        fila5.add("Bia");
        fila5.add("Carlos");

        System.out.println("Bia está na fila? " + fila5.contains("Bia"));
        System.out.println("Zoe está na fila? " + fila5.contains("Zoe")); */

        // 6. Crie uma fila vazia. Antes de usar o peek, teste com isEmpty(): - se estiver vazia  -> "Não tem ninguém na fila." - se tiver gente    -> "Próximo: [nome]" Depois adicione uma pessoa e teste de novo.

        /* ArrayDeque<String> fila6 = new ArrayDeque<>();

        if (fila6.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        } else {
            System.out.println("Próximo: " + fila6.peek());
        }

        fila6.add("Ana");

        if (fila6.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        } else {
            System.out.println("Próximo: " + fila6.peek());
        } */
    }
}