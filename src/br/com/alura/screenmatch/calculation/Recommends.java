package br.com.alura.screenmatch.calculation;

public class Recommends {

    private String recommend;

    public void filter(Classification star) {
        if (star.getClassification() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (star.getClassification() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}