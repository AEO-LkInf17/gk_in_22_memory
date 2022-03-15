package de.aeo.memeory;

import de.aeo.memeory.position.Position;
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
        /*
        Spielbrett s1 = new Spielbrett(5);
        s1.setPositionsbezeichnung();

        Karte k1 = new Karte(":P", 1, s1, 2, false);
        k1.setPosition(s1);
        System.out.println(k1);

        Karte k2 = new Karte(":P", 1, s1, 2, false);
        k2.setPosition(s1);
        System.out.println(k2);
        **/
        Spieler sp = new Spieler();
        
        Spielmechanik sm = new Spielmechanik(sp);
        Spielbrett s = new Spielbrett(0,sm,5,4);
        Karte k0 = new Karte(0);
        s.legeKartehin(k0, 0, 0);
        Karte k1 = new Karte(0);
        s.legeKartehin(k1, 1, 0);
        System.out.println(""+sm.vergleich(k0, k1));
        System.out.println(s.wasliegtaufxy(0, 0));
        
        sp.setPaare();
        System.out.println(sp);

        /*
        System.out.println("Hallo Welt!");
        int[][] zahlen = new int[3][3];
        zahlen[0][0]=1;
        System.out.println(zahlen[1][1]);
        System.out.println(zahlen[0][0]);
        **/
    }
}
