package org.example.Decorator;

    public class GranolaDecorator extends AcaiDecorator {
        public GranolaDecorator(Acai acai) {
            super(acai);
        }

        @Override
        public String getDescricao() {
            return acaiEmbrulhado.getDescricao() + " + Granola";
        }

        @Override
        public double getPreco() {
            return acaiEmbrulhado.getPreco() + 1.50;
        }
    }

