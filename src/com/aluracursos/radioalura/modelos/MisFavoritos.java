package com.aluracursos.radioalura.modelos;

public class MisFavoritos {

    public void adicione(Audio audio) {
        if (audio.getClasificacion() >= 8) {
            System.out.println(audio.getTitulo() + ": Es uno de los favoritos del momento");
        } else {
            System.out.println(audio.getTitulo() + ": Está a punto de ser uno de los favoritos");
        }
    }
}
