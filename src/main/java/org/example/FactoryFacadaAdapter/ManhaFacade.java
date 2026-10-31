package org.example.FactoryFacadaAdapter;

public class ManhaFacade {



    // Atributos da classe
    private Despertador despertador;
    private Cafeteira cafeteira;
    private Chuveiro chuveiro;

    // Construtor
    public ManhaFacade() {
        despertador = new Despertador();
        cafeteira = new Cafeteira();
        chuveiro = new Chuveiro();
    }

    public void acordar(){
        despertador.desligar();
        cafeteira.fazerCafe();
        chuveiro.ligar();
    }
}
