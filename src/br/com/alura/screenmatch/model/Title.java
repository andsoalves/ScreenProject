package br.com.alura.screenmatch.model;

public class Title {

    //Aqui sao atributos, informaçoes que todos os objetos criados deverao ter.
    // Estes Atributos abaixo foram colocados em private, para que de fora desta classe
    // nao consigam atribuir novos valores, evitando alteracoes indevidas ou burlando notas *neste caso*
    private String name;
    private int yearOfLaunch;
    private boolean includeOnPlan;
    private double sumStars;
    private int countStars;
    private int durationInMinutes;

    //Aqui vou Criar  Metodos.Tera a Funcao de devolver a ficha tecnica de cada Filme.
    public void displayFilm() {
        //Aqui estou printando um Atributo deste Objeto que Crie Acima.
        System.out.println("Nome do Titulo: " + name);
        System.out.println("Ano de Nascimento = " + yearOfLaunch);
    }

    public void evaluation(double note) {
        sumStars += note;
        countStars++;
    }

    public double pegaMedia() {
        double media = sumStars / countStars;
        return media;
    }

    public String getName() {
        return name;
    }

    public int getYearOfLaunch() {
        return yearOfLaunch;
    }

    public double getSumStars() {
        return sumStars;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfLaunch(int yearOfLaunch) {
        this.yearOfLaunch = yearOfLaunch;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

}
