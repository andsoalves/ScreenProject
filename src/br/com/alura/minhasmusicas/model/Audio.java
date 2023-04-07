package br.com.alura.minhasmusicas.model;

public class Audio {
    String titulo;
    int totalDeReproducoes;
    int totalDeCurtidas;
    int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void curtir(){
        this.totalDeCurtidas++;
    }
    public void reproduz(){
        this.totalDeReproducoes++;
            }
}
