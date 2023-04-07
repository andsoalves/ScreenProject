package br.com.alura.screenmatch.model;// A Classe Especifica o Conteudo de um Objeto
// Um dos Pilares é a Abstraçao,
// entao devo colocar os atributos comuns em todos os filmes.

import br.com.alura.screenmatch.calculation.Classification;

//Usando heranca, com a PALAVRA EXTENDS estou informando que film tem tudo que a classe title tem,
// mais estes outros atributos.
public class Film extends Title implements Classification {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) pegaMedia() / 2;
    }
}

