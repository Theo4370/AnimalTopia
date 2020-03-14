package com.company;

public class Mamifero extends Animal implements Tomador {
    public Mamifero(String animal, Integer energia) {
        super(animal, energia);

    }

    @Override
    public void tomarMate() {
        System.out.println("Soy un mamífero tomando mate.");
        Integer nuevaEnergia;
        nuevaEnergia = getEnergia() + 5 * ((int) Math.random()+1)*10;
        System.out.println("Mi energia era: " + getEnergia() + ", ahora es " + nuevaEnergia);
    }
}
