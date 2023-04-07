package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculation.Classification;

public class Episode implements Classification {
    private int numero;
    private String nome;
    private Serie serie;
    private int views;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    @Override
    public int getClassification() {
        if (views >= 100) {
            return 4;
        } else {
            return 2;
        }

    }
}