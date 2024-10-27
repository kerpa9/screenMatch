package com.kevenreyes.screenmatch.calculus;

import com.kevenreyes.screenmatch.models.Title;

public class TimeCal {

    private int timeTotal;

    public int getTimeTotal() {
        return timeTotal;
    }

    public void setTimeTotal(int timeTotal) {
        this.timeTotal = timeTotal;
    }

    
    public void include(Title title){
        System.out.println("Add durations in minuts: " + title);
        this.timeTotal+=title.getDurationsInMinuts();
    }

    
}
