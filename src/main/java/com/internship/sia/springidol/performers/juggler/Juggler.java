package com.internship.sia.springidol.performers.juggler;

import com.internship.sia.springidol.exception.PerformanceException;
import com.internship.sia.springidol.Performer;

public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
}
