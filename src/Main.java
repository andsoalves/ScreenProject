import br.com.alura.screenmatch.calculation.TimeCalculator;
import br.com.alura.screenmatch.model.Film;
import br.com.alura.screenmatch.model.Serie;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //Existem os tipos primitivos, e este é um tipo *Referencia*,
        // é algo que eu criei em outro momento no codigo, atraves da classe film

        //Abaixo temos Tipo da variavel = FILM , nome da Variavel = myFilm
        //o Lado esquedo do codigo esta apenas "Guardando" o objeto na variavel
        //no lado direito temos o momento que o Codigo CRIA o objeto.
        Film myFilm = new Film();

        //Aqui para baixo estamos "Estanciando"o Objeto,criar uma nova referencia a um objeto.
        myFilm.setName("O Poderoso Chefao");
        myFilm.setYearOfLaunch(1929);
        myFilm.setDurationInMinutes(99);

        myFilm.displayFilm();
        myFilm.evaluation(10);
        myFilm.evaluation(5);
        myFilm.evaluation(10);

        System.out.println(myFilm.pegaMedia());
        System.out.println(myFilm.getSumStars());

        Serie lost = new Serie();
        lost.setEpisodeTemp(10);
        lost.setSeasons(12);
        lost.setMinOfEpi(100);

        System.out.println(lost.getDurationInMinutes());

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myFilm);
        calculator.include(lost);
        System.out.println("calculator " +calculator.getTotalTime() + " min");

    }
}