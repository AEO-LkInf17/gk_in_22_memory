package de.aeo.memeory;

import de.aeo.memeory.position.Position;
import java.util.ArrayList;

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
        Spielbrett s1 = new Spielbrett(5);
        s1.setPositionsbezeichnung();

        Karte k1 = new Karte(":P", 1, s1, 2, false);
        k1.setPosition(s1);
        System.out.println(k1);

        Karte k2 = new Karte(":P", 1, s1, 2, false);
        k2.setPosition(s1);
        System.out.println(k2);
    }
}
