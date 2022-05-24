package de.aeo.memeory;

import java.util.ArrayList;
import java.io.*;

public class Spielmechanik implements Serializable {

    //Attribute//------------------------------------------------------------
    private Spieler spieler;
    private int paarAnzahl;
    private Spielbrett s;

    //Konstruktor//------------------------------------------------------------
    public Spielmechanik(Spieler spieler, Spielbrett s) {
        this.spieler = spieler;
        this.paarAnzahl = paarAnzahl;
        this.s = s;
    }

    //Ausfuehrung//------------------------------------------------------------
    public boolean umdrehen(Karte k, Karte l) { //karten sind umgedreht
        k.setUmgedreht(true);
        l.setUmgedreht(true);
        vergleich(k, l); //setzt nur ein, wenn max 2 karten umgedreht (true) sind
        return true; 
    }

    public boolean vergleich(Karte k, Karte l) {
        if (k.getUmgedreht() == true & l.getUmgedreht() == true) {
            if (k.getMotivnr() == l.getMotivnr()) {
                k.setPaarGefunden(true);
                l.setPaarGefunden(true);
                spieler.setPaare();
                spieler.setZuege();
                spielEnde(paarAnzahl); //variiert nach Paaranzahl
                //System.out.println("Paar + Zug"); //Test
                return true; //aufgedeckt lassen (true)
            } else {
                k.setUmgedreht(false);
                l.setUmgedreht(false);
                spieler.setZuege();
                //System.out.println("kein Paar + Zug"); //Test
                return false; //wenn kein Paar -> wieder umdrehen (false)
            }
        } else {
            System.out.println("Vergleich nicht moeglich");
            return false;
        }

    }
     
    public boolean spielEnde(int paarAnzahl) { //leitet Spielende ein
        if (paarAnzahl == spieler.getPaare()) {
        } return true; //weiterer Quellcode nach Implementierung der Speicherschicht
    }

    //set-Methoden//------------------------------------------------------------
    public int setPaarAnzahl() { 
        paarAnzahl = s.getBreite() * s.getHoehe()/2; //gibt max Paaare auf dem Feld
        return paarAnzahl;
    }

    public Spielbrett setSpielbrett(Spielbrett spielbrett) {
        return spielbrett = spielbrett;
    }

    //get-Methoden//------------------------------------------------------------
    public int getPaarAnzahl() {
        return paarAnzahl;
    }

}
