package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("My hearh will go on");
        miCancion.setCantante("Celine Dion");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Martha y Yordi");
        miPodcast.setTitulo("De todo un mucho");

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 5000; i++) {
            miCancion.reproduce();
        }

        System.out.println("Total de reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de Me Gusta:  " + miCancion.getTotalDeMeGusta());
    }

}
