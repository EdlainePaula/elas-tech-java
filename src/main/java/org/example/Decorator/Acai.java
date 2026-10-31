package org.example.Decorator;

public interface Acai {
    String getDescricao();
    double getPreco();
}


/*Questão 3 (prática). O seu sistema já tem esta interface e estas duas classes:
public interface Acai {
    String getDescricao();
    double getPreco();
}
public class AcaiSimples implements Acai {
    public String getDescricao() {
        return "Açaí Simples";
    }
    public double getPreco() {
        return 12.00;
    }
}
public abstract class AcaiDecorator implements Acai {
    protected Acai acaiEmbrulhado;

    public AcaiDecorator(Acai acai) {
        this.acaiEmbrulhado = acai;
    }
}
No main:
Crie um açaí só com granola e imprima a descrição e o preço.cl
Crie um açaí com granola e morango (um adicional embrulhando o outro) e imprima a descrição e o preço.*/