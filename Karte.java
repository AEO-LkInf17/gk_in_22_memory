package de.aeo.memeory;

public class Karte {

    private String kartenruecken;
    private int motiv;
    private Spielbrett position; //2D-ArrayList
    private int seitenlaenge; //variiert je nach Spielbrett
    private boolean paarGefunden;

    public Karte(String kartenruecken, int motiv, Spielbrett positionsbezeichnung, int seitenlaenge, boolean paarGefunden) {
        this.kartenruecken = null;
        this.motiv = motiv;
        this.position = null; //zufaellig zugeteilt
        this.seitenlaenge = seitenlaenge;
        this.paarGefunden = false;
    }

    public void setSeitenlaenge(int neueSeitenlaenge) {
        this.seitenlaenge = neueSeitenlaenge;
    }

    public void setPosition(Spielbrett positionsbezeichnung) {
        this.position = positionsbezeichnung;
    }

    /*public boolean setPaarGefunden()
  {
    if (Spielmechanik.vergleich() = true)
    {
      set this.paarGefunden = true;
    }S
  }*/
    public String toString() {
        return "" + position + motiv;
    }
}
