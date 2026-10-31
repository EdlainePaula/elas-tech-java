package org.example.FactoryFacadaAdapter;

public class TestesExercicios {
    public static void main(String[] args) {
        System.out.print("Testes dissertavivos e práticos: Factory, Facade e Adaptor:");
        System.out.print("Questão 1. Explique com suas palavras qual problema o Factory resolve.\n O que aconteceria se os ifs que decidem qual objeto criar ficassem espalhados pelo main e por outras partes do programa, e depois surgisse um tipo novo?\n"
        + "Resposta: O Factory serve para centralizar a criação de objetos, evitando que fiquem espalhados pelo programa. Se os ifs estivessem distribuídos pelo main e por outras classes, a inclusão de um novo tipo exigiria alterações em vários pontos do código"
        );

        System.out.println("Questão 2: O método da fábrica normalmente devolve o objeto criado com qual tipo?\n" +
                "a) O tipo da classe concreta (ex.: Cachorro)\n" +
                "\u001B[31mb) O tipo da interface (ex.: Animal) \n" +
                "\u001B[0mc) String\n" +
                "d) Não devolve nada (void)\n"
        );

         /*Exercicio 3
         Questão 3 (prática). Implemente a interface e as classes abaixo: public interface Animal {
    void emitirSom();
}
public class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}public class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}Crie a classe AnimalFactory com um metodo getAnimal(String tipo):
• se o tipo for "cachorro", devolve um Cachorro;
• se o tipo for "gato", devolve um Gato.
No main, use a fábrica para criar um cachorro e um gato e chame emitirSom() nos dois. O main não pode ter new Cachorro() nem new Gato().*/

        Animal cachorro = AnimalFactory.getAnimal("cachorro");
        Animal gato = AnimalFactory.getAnimal("gato");

        cachorro.emitirSom();
        gato.emitirSom();

        System.out.println("Questão 4. Seu sistema precisa usar uma classe de pagamento de outra empresa, mas ela não implementa a sua interface. Por que não dá para simplesmente escrever implements na classe dela? O que você faz no lugar?\n");
        System.out.println("O Adapter é uma classe intermediária que implementa a interface do meu sistema e adapta as chamadas para os métodos da classe externa. Assim, consigo utilizar uma implementação de terceiros sem precisar modificar o código original dela.");
        System.out.println("Questão 5. Em um Adapter, onde fica a tradução (por exemplo, a conversão de dólar para real)?\n" +
                "• a) Na classe de fora\n" +
                "• b) Na interface\n" +
                "\u001B[31mc) No método implementado da interface, dentro do adapter \n" +
                "\u001B[0md) No main, antes de chamar o método");
    }

}
