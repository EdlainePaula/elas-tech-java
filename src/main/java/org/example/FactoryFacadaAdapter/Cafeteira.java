package org.example.FactoryFacadaAdapter;
/* Questão 9 (prática). Você já tem estas três classes:
public class Despertador {
    public void desligar() {
        System.out.println("Despertador desligado.");
    }
}
public class Cafeteira {
    public void fazerCafe() {
        System.out.println("Café pronto.");
    }
}
public class Chuveiro {
    public void ligar() {
        System.out.println("Chuveiro ligado.");
    }
}
Crie a classe ManhaFacade com um metodo acordar() que desligue o despertador, faça o café e ligue o chuveiro, nessa ordem.
No main, use só a fachada: crie um objeto ManhaFacade e chame acordar().*/


public class Cafeteira {

    public void fazerCafe() {
        System.out.println("Café pronto.");
    }
}