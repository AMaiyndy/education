package com.internship.sia.springidol.performers.instrumentalist.onemanband;

import com.internship.sia.springidol.Performer;
import com.internship.sia.springidol.exception.PerformanceException;
import com.internship.sia.springidol.instruments.Instrument;

import java.util.Map;

public class OneManBand implements Performer {
    private Map<String, Instrument> instruments;

    public OneManBand() {
    }

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }

    public Map<String, Instrument> getInstruments() {
        return instruments;
    }

    @Override
    public void perform() throws PerformanceException {
        for (String key : instruments.keySet()) {
            System.out.print(key + " : ");
            Instrument instrument = getInstruments().get(key);
            instrument.play();
        }
    }
}
