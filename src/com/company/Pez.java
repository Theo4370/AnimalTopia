package com.company;

public class Pez extends Animal implements Tomador {
    public Pez(String animal, Integer energia, Boolean volador) {
        super(animal, energia);
    }

    @Override
    public void tomarMate() {

    }
}
