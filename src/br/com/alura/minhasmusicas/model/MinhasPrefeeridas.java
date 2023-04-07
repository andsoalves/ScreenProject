package br.com.alura.minhasmusicas.model;

public class MinhasPrefeeridas {
    public void inclui (Audio audio) {
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " Nota 9 acima da media ");
        } else {
            System.out.println(audio.getTitulo() + " Nota Abaixo de 9");
        }
    }
}
