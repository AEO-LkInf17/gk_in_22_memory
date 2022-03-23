package de.aeo.memeory;

import java.util.ArrayList;

public class Spielmechanik {

    private Spieler spieler;

    public Spielmechanik(Spieler spieler) {
        this.spieler = spieler;
    }

    public boolean umdrehen(Karte k, Karte l) {
        k.setUmgedreht(true);
        l.setUmgedreht(true);
        vergleich(k, l);
        return true;
    }

    public boolean vergleich(Karte k, Karte l) {
        if (k.getUmgedreht() == true & l.getUmgedreht() == true) {
            if (k.getMotivnr() == l.getMotivnr()) {
                k.setPaarGefunden(true);
                l.setPaarGefunden(true);
                spieler.setPaare();
                spieler.setZuege();
                System.out.println("Paar + Zug");
                return true; //aufgedeckt lassen
            } else {
                k.setUmgedreht(false);
                l.setUmgedreht(false);
                spieler.setZuege();
                System.out.println("kein Paar + Zug");
                return false; // umdrehen
            }
        } else {
            System.out.println("Vergleich nicht moeglich");
            return false;
        }

    }

    /*
    public boolean spielEnde() {
        if (Karte.paarGefunden(k) = true) {
            //beende das Spiel
        }
    }
    **/
}
