package de.aeo.memeory;

import java.io.*;

public class Karte implements Serializable {

    //Attribute//------------------------------------------------------------
    private String kartenruecken;
    private int motivnr;
    private Spielbrett position;
    private int positionX;
    private int positionY; 
    private int seitenlaenge; //variiert je nach Spielbrett
    private boolean paarGefunden; //Wahrheitswert, ob ein Paar gefunden wurde oder nicht (wenn auf true gesetzt wird, ist es unveränderlich)
    private boolean umgedreht; //Wahrheitswert, ob die Karte im Moment umgedreht ist oder nicht
    
    //Konstruktor//------------------------------------------------------------
    public Karte(int motivnr){
        this.kartenruecken = null;
        this.motivnr = motivnr;
        this.position = position;
        this.positionX = positionX;
        this.positionY = positionY;
        this.seitenlaenge = 1; //sollte irgendwann mal gemacht werden lol
        this.paarGefunden = false;
        this.umgedreht = false;
    }
    
    //set-Methoden//------------------------------------------------------------
    public void setSeitenlaenge(int neueSeitenlaenge) {
        this.seitenlaenge = neueSeitenlaenge;
    }

    public void setPosition(Spielbrett position) {
        this.position = position;
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

    //get-Methoden//------------------------------------------------------------
    public int getMotivnr() {
        return motivnr;
    }

    public boolean getUmgedreht() {
        return umgedreht;
    }
    
    public String toString() {
        return positionX + " " + positionY + " " + motivnr;
    }
}
