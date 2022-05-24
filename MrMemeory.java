package de.aeo.memeory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.io.*;

/////////////////////// Verwaltungsklasse ///////////////////////
public class MrMemeory { //wenn gui funktioniert, dann wichtig
    private static MrMemeory instance;
    private ArrayList<Karte> kartenliste = new ArrayList<>(); //fuer das kartenspeichern, wahrscheinlich unnoetig

    public static MrMemeory getInstance() {
        if (instance == null) {
            instance = new MrMemeory();
        }
        return instance;
    }
    
    /*public void fuegeKarteHinzu(Karte k) {
        kartenliste.add(k); 
    }*/
    
    public void starteSpiel()
    {
        Spieler sp = new Spieler();
        Spielbrett s = new Spielbrett(0, 5, 4);
        Spielmechanik sm = new Spielmechanik(sp, s);
        Karte k0 = new Karte(0); //unbedingt for-Schleife und Arraylist zur vereinfachten Erstellung implementieren
        Karte k1 = new Karte(0);
        Karte k2 = new Karte(1);
        Karte k3 = new Karte(1);
        s.setSpielmechanik(sm);
        s.setPositionsbezeichnung(); //wirft Gitter aus
        s.legeKartehin(k0, s.setZufallx(1, 5), s.setZufally(1, 4)); // auch for-Schleife
        s.legeKartehin(k1, s.setZufallx(1, 5), s.setZufally(1, 4));
        for (Karte k : this.kartenliste) { //alle karten werden komplett gespeichert, nicht nur die position
            kartenliste.add(k);
        }
        
        try { //Speicherblock - spaeter vielleicht auslagern wie mit GUI
            FileOutputStream fileOut = new FileOutputStream("test.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(sp);
            out.writeObject(s);
            out.writeObject(sm);
            for (Karte k : this.kartenliste) { //for-schleife fuer karten-speichern eingefuegt
                out.writeObject(k);
            }
            out.close();
            fileOut.close();
            System.out.println("Serialized Data is saved in Spielstand.ser"); //mit fortfahren diese datei aufrufen, spielstand beim verlassen eines spiels soll aktualisiert werden
        } catch (IOException i) {
            i.printStackTrace();
        }
        System.out.println(k0);
  }
  /*public Spielbrett waehleSpielgroesse(Spielbrett sb) //waehlt Spielbrett
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
  public void oeffnePause()
  {
    
  }*/
    
    public static void main(String[] args) {

        /*Spieler sp = new Spieler();
        Spielbrett s = new Spielbrett(0, 5, 4);
        Spielmechanik sm = new Spielmechanik(sp, s);
        Karte k0 = new Karte(0);
        Karte k1 = new Karte(0);
        Karte k2 = new Karte(1);
        Karte k3 = new Karte(1);
        s.setSpielmechanik(sm);
        s.setPositionsbezeichnung(); //wirft Gitter aus
        s.legeKartehin(k0, s.setZufallx(1, 5), s.setZufally(1, 4));
        s.legeKartehin(k1, s.setZufallx(1, 5), s.setZufally(1, 4));*/
        
        //System.out.println(k0);
        /*try { //Speicherblock - spaeter vielleicht auslagern wie mit GUI
            FileOutputStream fileOut = new FileOutputStream("test.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(sp);
            out.writeObject(s);
            out.writeObject(sm);
            for (karte k : this.kartenliste) {
                out.writeObject(k);
            }
            out.close();
            fileOut.close();
            System.out.println("Serialized Data is saved in test.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
        
        Spieler spF;
        Spielbrett sF;
        Spielmechanik smF;
        Karte k0F;
        Karte k1F;
        Karte k2F;
        Karte k3F;
        
        try {
            FileInputStream fileIn = new FileInputStream("test.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            spF = (Spieler) in.readObject();
            sF = (Spielbrett) in.readObject();
            smF = (Spielmechanik) in.readObject();
            k0F = (Karte) in.readObject();
            k1F = (Karte) in.readObject();
            k2F = (Karte) in.readObject();
            k3F = (Karte) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
        
        System.out.println("gespeichert: " + k0F);*/

        //sm.umdrehen(k0, k1);
        //sm.umdrehen(k2, k3);
        //sm.vergleich(k0, k1);
        //sm.vergleich(k2, k3);

        //System.out.println(k0);
        
        //sm.setSpielbrett(s);
        //sm.setPaarAnzahl();
        //System.out.println(sm.getPaarAnzahl());
        //System.out.println("" + sm.vergleich(k0, k1)); //vergleicht Karten
        //System.out.println(s.wasliegtaufxy(0, 0)); //checkt, welche Karte auf dieser Position liegt
        //System.out.println(sp);
        //s.setZufallx(0, 5);
        //s.setZufally(0, 4);
    }
}
