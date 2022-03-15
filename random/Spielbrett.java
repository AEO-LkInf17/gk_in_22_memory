package de.aeo.project_memeory.trunk;
import java.util.Random;

import java.util.Arrays;

public class Spielbrett {

    private int hintergrund;
    public int[][] positionsbezeichnung;
    private Karte[][] karten;
    private Spielmechanik spielmechanik;

    public Spielbrett(int hintergrund,Spielmechanik s,int breite,int hoehe) {
        this.hintergrund = hintergrund;
        this.positionsbezeichnung = positionsbezeichnung;
        this.karten = new Karte[breite][hoehe];
        this.spielmechanik = s;
    }

    public static int setZufallx (int min, int max) {
        Random randX = new Random();
        int randomNum = randX.nextInt(max - min);
        int x = randomNum + min;
        return x;
    }
    public static int setZufally (int min, int max) {
        Random randY = new Random();
        int randomNum = randY.nextInt(max - min);
        int y = randomNum + min;
        return y;
    }
    
    public void legeKartehin(Karte k){
        int x = setZufallx(1, 4);
        int y = setZufally(1, 5);
        karten[x][y]=k;
        System.out.println(""+karten[x][y]);
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
