package org.example.FactoryFacadaAdapter;

public class Gato implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}