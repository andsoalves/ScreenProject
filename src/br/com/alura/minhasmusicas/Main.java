package br.com.alura.minhasmusicas;

import br.com.alura.minhasmusicas.model.MinhasPrefeeridas;
import br.com.alura.minhasmusicas.model.Music;
import br.com.alura.minhasmusicas.model.Podcast;
import br.com.alura.screenmatch.calculation.Recommends;
import br.com.alura.screenmatch.calculation.TimeCalculator;
import br.com.alura.screenmatch.model.Film;
import br.com.alura.screenmatch.model.Serie;

public class Main {
    public static void main(String[] args) {

        Music myMusc = new Music();
        myMusc.setTitulo("Titulo musica");
        myMusc.setCantor("Aleatorio");

        for (int i = 0; i < 50; i++) {
            myMusc.reproduz();
            myMusc.curtir();
        }

        Podcast myPdc = new Podcast();
        myPdc.setTitulo("Titulo podcast");
        myPdc.setApresentador("Apresentador");

        for (int i = 0; i < 500; i++) {
            myPdc.reproduz();
        }
        for (int i = 0; i < 100; i++) {
            myPdc.curtir();
        }

        MinhasPrefeeridas prefeeridas = new MinhasPrefeeridas();
        prefeeridas.inclui(myPdc);
        prefeeridas.inclui(myMusc);
        System.out.println(myMusc.getTotalDeCurtidas());
    }
}