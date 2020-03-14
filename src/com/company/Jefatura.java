package com.company;

import java.util.ArrayList;
import java.util.List;

public class Jefatura {
    private List<Animal> listaAnimales;
    private List<Tomador> listaTomadores;

    public Jefatura() {
        this.listaAnimales = new ArrayList<>();
        this.listaTomadores = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal) {
        listaAnimales.add(animal);

    }
//todo HACER QUE LO AGREGUE SOLO EXCEPTO EL PEZ
    public void agregarTomador(Tomador tomador){
      listaTomadores.add(tomador);
    }

    public List<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public List<Tomador> getListaTomadores() {
      return listaTomadores;
    }


    public void prenderRobot() {
        System.out.println("PIP, PUP: VOY A CEBAR MATES");
        for (Tomador tomador : listaTomadores) {

            tomador.tomarMate();
        }
        System.out.printf("PIM, POM, PUM: TERMINO LA RONDA DE MATES");
    }

}