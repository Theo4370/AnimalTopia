package com.company;

public class Reptil extends Animal implements Tomador{
    public Reptil(String animal, Integer energia) {
        super(animal, energia);
    }

    @Override
    public void tomarMate() {
        System.out.println("Soy un reptir tomando mate");
        Integer nuevaEnergia;
        nuevaEnergia = getEnergia() * ((int)Math.random()+1)*2;
        System.out.println("Mi energia era "+getEnergia()+" y ahora es "+nuevaEnergia);
    }
}
