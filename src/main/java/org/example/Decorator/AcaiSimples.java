package org.example.Decorator;

public class AcaiSimples implements Acai {
    public String getDescricao() {
        return "Açaí Simples";
    }

    @Override
    public double getPreco() {
        return 12.00;
    }
}
