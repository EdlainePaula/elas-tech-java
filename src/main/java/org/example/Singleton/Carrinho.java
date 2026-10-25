/*7. Crie uma classe Singleton chamada Carrinho que:
-tenha um atributo quantidadeItens, começando em 0;
-tenha um metodo adicionarItem() que soma 1 à quantidade;
-tenha um metodo getQuantidadeItens() que devolve a quantidade.No main, obtenha o carrinho em duas variáveis diferentes, telaProdutos e telaPromocoes, adicione itens usando as duas, e imprima a quantidade final. O resultado deve mostrar que as duas telas usam o mesmo carrinho.
Exemplo de saída esperada:Itens no carrinho: 4*/

package org.example.Singleton;

public class Carrinho {
    private int quantidadeItens = 0;

    private static Carrinho instancia;

    private Carrinho(){

    }

    public static Carrinho getInstancia() {

        if (instancia == null) {
            instancia = new Carrinho();
        }

        return instancia;
    }


    public void adicionarItem() {
        quantidadeItens++;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
}