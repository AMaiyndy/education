package com.internship.sia.springidol.performers.magician;

import com.internship.sia.springidol.Performer;
import com.internship.sia.springidol.exception.PerformanceException;

public class Magician implements Performer {
    private MagicBox magicBox;
    private String magicWords;

    public Magician() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println(this.getMagicWords());
        System.out.println("The magic box contains...");
        System.out.println(this.getMagicBox().getContents());
    }

    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox;
    }

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }

    public MagicBox getMagicBox() {
        return magicBox;
    }

    public String getMagicWords() {
        return magicWords;
    }
}
