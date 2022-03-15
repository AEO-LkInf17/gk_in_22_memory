package de.aeo.project_memeory.trunk;

public class Karte {

    private String kartenruecken;
    private int motivnr;
    private Spielbrett position; //2D-ArrayList
    private int seitenlaenge; //variiert je nach Spielbrett
    private boolean paarGefunden;

    public Karte(String kartenruecken, int motivnr, Spielbrett positionsbezeichnung, int seitenlaenge, boolean paarGefunden) {
        this.kartenruecken = null;
        this.motivnr = motivnr;
        this.position = null; //zufaellig zugeteilt
        this.seitenlaenge = seitenlaenge;
        this.paarGefunden = false;
    }
    
    public Karte(int motivnr){
        this.kartenruecken = null;
        this.motivnr = motivnr;
        this.position = null; //zufaellig zugeteilt
        this.seitenlaenge = 1;
        this.paarGefunden = false;
    }

    public void setSeitenlaenge(int neueSeitenlaenge) {
        this.seitenlaenge = neueSeitenlaenge;
    }

    public void setPosition(Spielbrett karten) {
        this.position = karten;
    }

    public String toString() {
        return "" + position + motivnr;
    }

    public int getMotivnr() {
        return motivnr;
    }

    public void setPaarGefunden(boolean paarGefunden) {
        this.paarGefunden = paarGefunden;
    }
    
    
}
