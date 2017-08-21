package com.internship.sia.springidol.performers;

import com.internship.sia.springidol.Performer;
import com.internship.sia.springidol.exception.PerformanceException;

public class Vocalist implements Performer {
    private String song;

    public Vocalist() {
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("Singing " + getSong());
    }
}
