package com.company;

public class Main {

    public static void main(String[] args) {
	Jefatura jefatura = new Jefatura();
	Animal hipopotamo = new Mamifero("Soy un hipopotamo", 100);
        Animal cocodrilo = new Reptil("Soy un cocodrilo", 80);
jefatura.agregarAnimal(hipopotamo);
jefatura.agregarTomador(hipopotamo);


    }
}
