package com.company;

public class Mamifero extends Animal {
    public Mamifero(String animal, Integer energia) {
        super(animal, energia);

    }

    @Override
    public void tomarMate() {
        Integer unidadesDeMate = (int) (Math.random()*10+1);
        System.out.println("Soy un mamífero tomando mate.");
        System.out.println("Me toco el mate con: "+unidadesDeMate+" unidades de mate");
        Integer nuevaEnergia;
        nuevaEnergia = getEnergia() + 5 * unidadesDeMate;
        System.out.println("Mi energia era: " + getEnergia() + ", ahora es " + nuevaEnergia);
    }
}
