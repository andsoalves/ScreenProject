package br.com.alura.screenmatch.model;

public class Serie extends Title {
    private int seasons;
    private boolean active;
    private int episodeTemp;
    private int minOfEpi;

    //Sobre Escrever Metodo do titulo para adaptar nesta minha Classe filha
    //usando o Override, para reescrevermos o metodo nesta classe.
    @Override
    public int getDurationInMinutes(){
        return seasons * episodeTemp * minOfEpi;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodeTemp() {
        return episodeTemp;
    }

    public void setEpisodeTemp(int episodeTemp) {
        this.episodeTemp = episodeTemp;
    }

    public int getMinOfEpi() {
        return minOfEpi;
    }

    public void setMinOfEpi(int minOfEpi) {
        this.minOfEpi = minOfEpi;
    }
}
