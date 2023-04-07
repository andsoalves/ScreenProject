package br.com.alura.screenmatch.calculation;

import br.com.alura.screenmatch.model.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime(){
        return totalTime;
    }
    public void include (Title title){
        this.totalTime += title.getDurationInMinutes();
    }

}
