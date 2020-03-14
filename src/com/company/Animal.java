package com.company;

public abstract class Animal {
    private String animal;
    private Integer energia;

    public Animal(String animal, Integer energia) {
        this.animal = animal;
        this.energia = energia;
    }

    public String getAnimal() {
        return animal;
    }

    public Integer getEnergia() {
        return energia;
    }
}
