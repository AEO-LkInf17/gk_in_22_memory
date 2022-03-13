package de.aeo.memeory;

import java.util.ArrayList;
import java.util.Arrays;

public class Spielbrett {

    private int hintergrund;
    public int[][] positionsbezeichnung;
    private Karte[][] karten;
    private Spielmechanik spielmechanik;

    public Spielbrett(int hintergrund,Spielmechanik s,int breite,int hoehe) {
        this.hintergrund = hintergrund;
        this.positionsbezeichnung = null;
        this.karten = new Karte[breite][hoehe];
        this.spielmechanik = s;
    }

    public void legeKartehin(Karte k,int x,int y){
        karten[x][y]=k;
    }
    
    public String wasliegtaufxy(int x,int y){
        return karten[x][y].toString();
    }
    
    public int setHintergrund(byte neuerHintergrund) {
        return this.hintergrund = neuerHintergrund;
    }

    public String toString() {
        return this.positionsbezeichnung + "";
    }

    public void setPositionsbezeichnung() { // Macht Array und vergisst ihn gleich wieder.
        int e = 0;
        int[][] position = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                position[i][j] = e;
                e++;
            }
        }
        for (int i = 0; i < position.length; i++) {
            for (int j = 0; j < position[i].length; j++) {
                System.out.print(position[i][j] + " ");
            }
            System.out.println();
        }
    }
    /*
    public int getPositionsbezeichnung() {
        return this.positionsbezeichnung;
    }
    **/
}
