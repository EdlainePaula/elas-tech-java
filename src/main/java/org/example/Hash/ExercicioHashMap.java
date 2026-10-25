import java.util.HashMap;

class ExercicioHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> notas = new HashMap<>();
        //1. Crie um HashMap de nomes e idades com três pessoas.
        //Imprima o mapinteiro e depois use get para mostrar a idade de uma delas.
        /*cadastro.put("Caio", 27);
        cadastro.put("Carlos", 30);
        cadastro.put("Paula", 42);
        cadastro.put("Diogo", 30);
        cadastro.put("Andressa", 21);

         int idadeCaio = cadastro.get("Caio");

        System.out.println(cadastro);
        System.out.println(idadeCaio);*/

        //2. Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00,imprima, e depois faça put de "café" DE NOVO com valor 7.50.Imprima outra vez e veja o que aconteceu com o tamanho.

       /* produtosPrecos.put("Cafe", 5.00);
        produtosPrecos.put("Cafe com leite", 6.00);
        produtosPrecos.put("MilkShake", 12.00);
        produtosPrecos.put("suco natural", 15.00);

        produtosPrecos.put("Cafe", 7.50);

        System.out.println(produtosPrecos);*/

        //3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey dentro de um if para mostrar o telefone de alguém que está na agenda e de alguém que não está.

       /* agenda.put("Caio", "99999-9999");
        agenda.put("Eliane", "88899-9999");

        if (agenda.containsKey("Caio")) {
            System.out.println(agenda.get("Caio"));
        }

        if (agenda.containsKey("João")) {
            System.out.println(agenda.get("João"));
        } else {
            System.out.println("João não está na agenda.");
        }*/

        //4. Crie um HashMap de estoque (produto -> quantidade) com dois itens. Use getOrDefault para mostrar a quantidade de um produto que existe e de um que não existe (devolvendo 0). Depois tente com get normalno que não existe e compare.


         /*estoque.put("Arroz", 5);
         estoque.put("Feijao", 10);
         estoque.put("Manteiga", 5);
         estoque.put("Queijo", 13);
         estoque.put("Leite", 8);

        System.out.println(estoque.getOrDefault("Arroz", 0));
        System.out.println(estoque.getOrDefault("Macarrão", 0));
        System.out.println(estoque.get("macarrão"));*/

        //5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho. Remova uma delas e imprima de novo.

        notas.put("Sheila", 7);
        notas.put("Maria", 10);
        notas.put("Caio", 1);

        System.out.println(notas);
        System.out.println(notas.size());

        notas.remove("Sheila");

        System.out.println(notas);
        System.out.println(notas.size());






    }
}