package de.aeo.memeory;

import java.util.ArrayList;

public class Spielmechanik {

    private Spieler spieler;
    private Karte a;
    private Karte b;

    public Spielmechanik(Spieler spieler) {
        this.spieler = spieler;
    }

    public boolean vergleich(Karte a, Karte b) {
        if (a.getMotivnr() == b.getMotivnr()) {
            a.setPaarGefunden(true);
            b.setPaarGefunden(true);
            spieler.setPaare();
            System.out.println("Paar");
            return true; //aufgedeckt lassen
        } else {
            a.setUmgedreht(false);
            b.setUmgedreht(false);
            System.out.println("kein Paar");
            return false; // umdrehen
        }
    }

    public boolean umdrehen1(Karte k) {
        k.setUmgedreht(true);
        k = a;
        return true;
    }
    public boolean umdrehen2(Karte k) {
        k.setUmgedreht(true);
        k = b;
        return true;
    }

    /*
    public boolean spielEnde() {
        if (Karte.paarGefunden(k) = true) {
            //beende das Spiel
        }
    }
    **/
    public void spielAnfang() {
        //brauchen wir diese Methode �berhaupt?
    }

    public void spielZug() {
        //drehe zwei Karten um
    }
}
