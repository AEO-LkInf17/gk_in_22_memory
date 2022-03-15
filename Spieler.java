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

    /*public int zaehleZuege()
  {
    for (Spielmechanik.spielZug() ) 
    {    //funktioniert das so �berhaupt?
      this.zuege ++;
    }
    }*/

    @Override
    public String toString() {
        return "Spieler{" + "paare=" + paare + ", zuege=" + zuege + '}';
    }
    
}
