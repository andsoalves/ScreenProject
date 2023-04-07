package br.com.alura.minhasmusicas.model;

public class Podcast extends Audio  {
    String apresentador;
    String descrica;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescrica() {
        return descrica;
    }

    public void setDescrica(String descrica) {
        this.descrica = descrica;
    }

    @Override
    public double getClassificacao() {
        if (this.getTotalDeCurtidas()>50) {
            return 10;
        } else {
            return 8;
        }
    }
}
