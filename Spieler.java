package de.aeo.memeory;

import java.io.*;

public class Spieler implements Serializable {

    public int paare;
    public int zuege;

    public Spieler() {
        this.paare = 0;
        this.zuege = 0;
    }

    public void setPaare() { //spielers paare werden hochgezaehlt
        this.paare++; 
    }

    public void setZuege() { //relevant fuer die speicherschicht
        this.zuege ++; 
    }

    @Override
    public String toString() { 
        return "Spieler{" + "paare=" + paare + ", zuege=" + zuege + '}';
    }

    public int getPaare() {
        return paare;
    }
    
}
