package org.example.Builder;

public class ClassesBuilder {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .borda("Catupiry")
                .sabor("Mussarela")
                .temQueijo(true)
                .build();

    }
}
