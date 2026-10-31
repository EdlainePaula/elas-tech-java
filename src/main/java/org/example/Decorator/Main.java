package org.example.Decorator;

public class Main {

    public static void main(String[] args){
        System.out.println("Questão 1. Uma açaiteria vende açaí com qualquer combinação de adicionais: granola, leite ninho, morango, paçoca. Por que criar uma classe para cada combinação (AcaiComGranola, AcaiComGranolaEMorango, AcaiComMorangoEPacoca...) é um problema? O que o Decorator faz no lugar?\n"
        + "Resposta: O Decorator permite criar opções individuais e criar o objeto no New quando precisar e adicionar funcionalidades ao objeto de forma dinâmica, combinando adicionais individualmente.. Evita criar várias classes de herança deixando o código extenso e dificil de manter\n");

        System.out.println("Questão 2. Em um Decorator, por que a classe AcaiDecorator tem implements Acai?\n" +
                "\n" +
                "a) Para poder ser criada com new\n" +
                "\u001B[31mb) Para que um adicional também conte como açaí e possa ir dentro de outro adicional\n" +
                "\u001B[0m O AcaiDecorator implementa a interface Acai porque precisa seguir o mesmo contrato do açaí original. Dessa forma, tanto o açaí simples quanto um açaí com adicionais podem ser tratados pelo mesmo tipo.\n" +"\u001B[0m Isso permite encadear os decorators: um GranolaDecorator pode envolver um AcaiSimples, e depois um MorangoDecorator pode envolver o açaí que já contém granola."+
                "\u001B[0mc) Para herdar o preço do açaí simples\n" +
                "d) Para não precisar usar o super\n"
        );


        //Ecercicio 3 - Interface Acai
        Acai acaiGranola = new GranolaDecorator(new AcaiSimples());

        System.out.println(acaiGranola.getDescricao());
        System.out.println(acaiGranola.getPreco());

        Acai acaiCompleto = new MorangoDecorator(
                new GranolaDecorator(new AcaiSimples())
        );

        System.out.println(acaiCompleto.getDescricao());
        System.out.println(acaiCompleto.getPreco());
    }
}
