package de.aeo.memeory;

public class Karte {

    private String kartenruecken;
    private int motivnr;
    private Spielbrett position;
    private int positionX;
    private int positionY;
    private int seitenlaenge; //variiert je nach Spielbrett
    private boolean paarGefunden;
    private boolean umgedreht;
    
    public Karte(int motivnr){
        this.kartenruecken = null;
        this.motivnr = motivnr;
        this.position = position;
        this.positionX = positionX;
        this.positionY = positionY;
        this.seitenlaenge = 1;
        this.paarGefunden = false;
        this.umgedreht = false;
    }

    public void setSeitenlaenge(int neueSeitenlaenge) {
        this.seitenlaenge = neueSeitenlaenge;
    }

    public void setPosition(Spielbrett position) {
        this.position = position;
    }

    public String toString() {
        return positionX + " " + positionY + " " + motivnr;
    }

    public int getMotivnr() {
        return motivnr;
    }

    public void setPaarGefunden(boolean paarGefunden) {
        this.paarGefunden = paarGefunden;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
    public void setUmgedreht(boolean umgedreht) {
        this.umgedreht = umgedreht;
    }
    public boolean getUmgedreht() {
        return umgedreht;
    } 
}
