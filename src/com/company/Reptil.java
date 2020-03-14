package com.company;

public class Reptil extends Animal implements Tomador {
    public Reptil(String animal, Integer energia) {
        super(animal, energia);
    }

    @Override
    public void tomarMate() {
        Integer otraUnidadesDeMate = (int) (Math.random()*10+1);
        System.out.println("Soy un reptir tomando mate");
        System.out.println("Me toco un mate con: " + otraUnidadesDeMate + " unidades");
        Integer nuevaEnergia;
        nuevaEnergia = getEnergia() * otraUnidadesDeMate * 2;
        System.out.println("Mi energia era " + getEnergia() + " y ahora es " + nuevaEnergia);
    }
}
