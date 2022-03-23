package de.aeo.memeory;

public class Spieler {

    public int paare;
    public int zuege;

    public Spieler() {
        this.paare = 0;
        this.zuege = 0;
    }

    public void setPaare() {
        this.paare++;
    }

    public void setZuege() {
        this.zuege ++;
    }

    @Override
    public String toString() {
        return "Spieler{" + "paare=" + paare + ", zuege=" + zuege + '}';
    }
    
}
