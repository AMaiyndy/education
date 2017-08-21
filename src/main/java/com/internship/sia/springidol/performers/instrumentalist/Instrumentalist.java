package com.internship.sia.springidol.performers.instrumentalist;

import com.internship.sia.springidol.instruments.Instrument;
import com.internship.sia.springidol.exception.PerformanceException;
import com.internship.sia.springidol.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable("pianist")
public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;

    public Instrumentalist() {
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

    @Autowired
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public Instrument getInstrument() {
        return instrument;
    }
}
