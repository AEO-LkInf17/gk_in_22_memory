package de.aeo.memeory;

import java.util.ArrayList;

public class Spielmechanik {

    public boolean vergleich(Karte k,Karte l) {
        if (k.getMotivnr() == l.getMotivnr()) {
            k.setPaarGefunden(true);
            l.setPaarGefunden(true);
            return true; //aufgedeckt lassen
        } else {
            return false; // umdrehen
        }
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
