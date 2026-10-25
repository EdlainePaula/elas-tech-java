package org.example.Singleton;
import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class ExercicioSingleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Escolha uma das opções:\n" + "a) Que a classe tenha vários construtores\n" +
                "b) Que exista apenas um objeto da classe no programa\n" +
                "c) Que a classe não tenha atributos\n" +
                "d) Que a classe possa ser herdada");

        String alternativa = scanner.nextLine();

        while (!alternativa.equalsIgnoreCase("b")) {

            System.out.println("Resposta incorreta. Tente novamente:");
            alternativa = scanner.nextLine();
        }

        System.out.println("Resposta correta! O padrão Singleton garante que uma classe tenha uma única instância e fornece uma forma de acessar essa instância.\n");


        System.out.println("Construtor private → impede que outras classes usem new → ajuda a garantir que exista apenas uma instância.\n");

        System.out.println("3. Complete a lacuna:\n" +
                "\n" +
                "java\n" +
                "private ______ Configuracao instancia;\n" +
                "a) final\n" +
                "b) public\n" +
                "c) static\n" +
                "d) void");


            String lacuna = scanner.nextLine();
        while (!lacuna.equalsIgnoreCase("static")) {

            System.out.println("Resposta incorreta. Tente novamente:");
            lacuna = scanner.nextLine();
        }
        System.out.println("O static é importante porque faz instancia pertencer à própria classe Configuracao, e não a cada objeto criado.\n");

        System.out.println("4. O que acontece se alguém tentar escrever isto fora da classe? java Configuracao c = new Configuracao():\n" + "O Java dará erro de compilação, porque o construtor privado só pode ser acessado dentro da própria classe Configuracao.");
        System.out.println("5. Qual é a forma correta de obter o objeto de um Singleton chamado Configuracao?\n" +
                "a) new Configuracao()\n" +
                "b) Configuracao.getInstancia()\n" +
                "c) Configuracao.instancia\n" +
                "d) this.getInstancia()");

        String objeto = scanner.nextLine();

        while (!objeto.equalsIgnoreCase("b")) {

            System.out.println("Resposta incorreta. Tente novamente:");
            objeto = scanner.nextLine();

        }
        System.out.println("Singleton → não uso new de fora → peço o objeto com getInstancia().\n");

        ContadorVisitas pagina1 = ContadorVisitas.getInstancia();
        ContadorVisitas pagina2 = ContadorVisitas.getInstancia();

        pagina1.registrarVisita();
        pagina1.registrarVisita();
        pagina2.registrarVisita();

        System.out.println("Total de visitas: " + pagina1.getTotal());

        Carrinho telaProdutos = Carrinho.getInstancia();
        Carrinho telaPromocoes = Carrinho.getInstancia();

        telaProdutos.adicionarItem();
        telaProdutos.adicionarItem();

        telaPromocoes.adicionarItem();
        telaPromocoes.adicionarItem();

        System.out.println("Itens no carrinho: " + telaProdutos.getQuantidadeItens());
    }
}
