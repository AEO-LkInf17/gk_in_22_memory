package de.aeo.memeory.gk_in_22_memory.git.trunk;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Spielbrett implements Serializable {

    //Attribute//------------------------------------------------------------
    private int hintergrund; //sollte eig ein bild sein
    private int[][] gitter;
    public Karte[][] position; //Arraylist für Objekte um Ueberschreibung zu verhindern
    public ArrayList<Karte> alleKarten = new ArrayList<>();//speichert alle Positionsinformationen aller Karten
    private Spielmechanik spielmechanik; 
    private int breite; //breite des gitters
    private int hoehe; //hoehe des spielbretts
    //private ArrayList<Karte> kartenliste = new ArrayList<>();

    //Konstruktor//------------------------------------------------------------
    public Spielbrett(int hintergrund, int breite, int hoehe) {
        this.hintergrund = hintergrund;
        this.gitter = gitter;
        this.position = new Karte[breite][hoehe];
        this.spielmechanik = spielmechanik;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    //Ausfuehrung//------------------------------------------------------------
    public Karte legeKartehin(Karte k, int x, int y) {
        System.out.println(position + "");
        alleKarten.add(k);
        k.setPositionX(x);
        k.setPositionY(y);
        return position[x][y] = k;
    }

    public int[][] erstelleGitter() {
        int[][] position = new int[breite][hoehe];
        for (int i = 0; i < breite; i++) {
            for (int j = 0; j < hoehe; j++) {
            }
        }
        for (int i = 0; i < position.length; i++) {  //printet das Spielbrett
            for (int j = 0; j < position[i].length; j++) {
                System.out.print(position[i][j] + " ");
            }
            System.out.println();
        }
        return gitter;
    }
    
    //Zufallsgeneratoren//------------------------------------------------------------
    public int setZufallx(int min, int max) { //x=breite
        Random randX = new Random();
        int randomNum = randX.nextInt(max - min);
        int x = randomNum;
        //System.out.println("" + x); //Test
        return x;
    }

    public int setZufally(int min, int max) { //y=hoehe
        Random randY = new Random();
        int randomNum = randY.nextInt(max - min);
        int y = randomNum;
        //System.out.println("" + y); //Test
        return y;
    }
    //set-Methoden//------------------------------------------------------------
    public int setHintergrund(byte neuerHintergrund) {
        return this.hintergrund = neuerHintergrund;

    }

    public Spielmechanik setSpielmechanik(Spielmechanik spielmechanik) {
        return spielmechanik;
    }
    
    //get-Methoden//------------------------------------------------------------
    public String wasliegtaufxy(int x, int y) { //test-methode
        return position[x][y] + "";
    }

    public int getBreite() {
        return breite;
    }

    public int getHoehe() {
        return hoehe;
    }

    /*public void fuegeKarteZuListeHinzu(Karte k) {
        kartenliste.add(k);
    }*/
}
