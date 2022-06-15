package de.aeo.memeory.gk_in_22_memory.git.trunk;

import java.io.*;

public class Spieler implements Serializable {

    //Attribute//------------------------------------------------------------
    public int paare;
    public int zuege;

    //Konstruktor//------------------------------------------------------------
    public Spieler() {
        this.paare = 0;
        this.zuege = 0;
    }

    //set-Methoden------------------------------------------------------------
    public void setPaare() { //spielers paare werden hochgezaehlt
        this.paare++; 
    }

    public void setZuege() { //relevant fuer die speicherschicht
        this.zuege ++; 
    }

    //get-Methoden//------------------------------------------------------------
    public int getPaare() {
        return paare;
    }

    public int getZuege() {
        return zuege;
    }
    
    @Override
    public String toString() { 
        return "Spieler{" + "paare=" + paare + ", zuege=" + zuege + '}';
    }
    
}
