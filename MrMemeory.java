package de.aeo.memeory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MrMemeory {

    /*public void starteSpiel()
  {
    
  }
  public Spielbrett waehleSpielgroesse(Spielbrett sb) //waehlt Spielbrett
  {
    //uebernimmt Layout eines Spielbretts
      return null;
    //uebernimmt Layout eines Spielbretts
  }
  public void spielLaden() //oeffnet zuletzt gespeichertes Spiel
  {
    
  }
  public void spielSpeichern()
  {
    
  }
  public void aufgeben() //schliessen des Spiels ohne speichern
  {
    
  }
  public void statistikenAufrufen()
  {
    
  }
  public void optionenAufrufen()
  {
    
  }
  public void programmSchliessen()
  {
    
  }
  public void oeffneTrigger()
  {
    
  }
  public void musikLautstaerke()
  {
    
  }
  public void sfxLautstaerke()
  {
    
  }
  public void hellDunkel() //meint Light- bzw. Darkmode
  {
    
  }
  public void fensterSchliessen()
  {
    
  }
  public void oeffnePause()
  {
    
  }*/
    public static void main(String[] args) {

        Spieler sp = new Spieler();
        Spielmechanik sm = new Spielmechanik(sp);
        Spielbrett s = new Spielbrett(0, sm, 5, 4);
        Karte k0 = new Karte(0);
        Karte k1 = new Karte(0);
        Karte k2 = new Karte(1);
        Karte k3 = new Karte(1);
        
        s.setPositionsbezeichnung(); //wirft Gitter aus
        s.legeKartehin(k0, s.setZufallx(1, 5), s.setZufally(1, 4));
        s.legeKartehin(k1, s.setZufallx(1, 5), s.setZufally(1, 4));
        
        sm.umdrehen1(k0);
        sm.umdrehen2(k1);
        sm.vergleich(k0, k1);
        
        //System.out.println("" + sm.vergleich(k0, k1)); //vergleicht Karten
        //System.out.println(s.wasliegtaufxy(0, 0)); //checkt, welche Karte auf dieser Position liegt

        //System.out.println(sp);
        //s.setZufallx(0, 5);
        //s.setZufally(0, 4);

    }
}
