package com.internship.sia.springidol.performers.instrumentalist;

import com.internship.sia.springidol.Performer;
import com.internship.sia.springidol.exception.PerformanceException;
import com.internship.sia.springidol.instruments.Instrument;

public abstract class AbstractInstrumentalist implements Performer{
    private String song;

    public AbstractInstrumentalist() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.print("Playing " + screamSong() +
                " : ");
        getInstrument().play();
    }

    public String getSong() {
        return song;
    }

    public String screamSong() {
        return getSong();
    }

    public void setSong(String song) {
        this.song = song;
    }

    public abstract Instrument getInstrument();
}
