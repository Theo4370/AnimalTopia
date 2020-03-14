package com.company;

public class Main {

    public static void main(String[] args) {
        Jefatura jefatura = new Jefatura();
        Mamifero hipopotamo = new Mamifero("Soy un hipopotamo", 100);
        Reptil cocodrilo = new Reptil("Soy un cocodrilo", 80);
        jefatura.agregarAnimal(hipopotamo);
        jefatura.agregarAnimal(cocodrilo);
        jefatura.agregarTomador(hipopotamo);
        jefatura.agregarTomador(cocodrilo);
        jefatura.prenderRobot();

    }
}
