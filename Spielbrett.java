package de.aeo.memeory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Spielbrett {

    private int hintergrund;
    private int[][] positionsbezeichnung;
    public Karte[][] position; //Arraylist für Objekte um Ueberschreibung zu verhindern
    public ArrayList<Karte> alleKarten = new ArrayList<>();//speichert alle Positionsinformationen aller Karten
    private Spielmechanik spielmechanik;

    public Spielbrett(int hintergrund, Spielmechanik s, int breite, int hoehe) {
        this.hintergrund = hintergrund;
        this.positionsbezeichnung = positionsbezeichnung;
        this.position = new Karte[breite][hoehe];
        this.spielmechanik = s;
    }

    public int setZufallx(int min, int max) {
        Random randX = new Random();
        int randomNum = randX.nextInt(max - min);
        int x = randomNum;
        //System.out.println("" + x); //Test
        return x;
    }

    public int setZufally(int min, int max) {
        Random randY = new Random();
        int randomNum = randY.nextInt(max - min);
        int y = randomNum;
        //System.out.println("" + y); //Test
        return y;
    }

    public Karte legeKartehin(Karte k, int x, int y) {
        System.out.println(position + "");
        alleKarten.add(k);
        k.setPositionX(x);
        k.setPositionY(y);
        return position[x][y] = k;
    }

    public String wasliegtaufxy(int x, int y) {
        return position[x][y] + "";
    }

    public int setHintergrund(byte neuerHintergrund) {
        return this.hintergrund = neuerHintergrund;

    }

    public int[][] setPositionsbezeichnung() { // erstellt Gitter
        int[][] position = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
            }
        }
        for (int i = 0; i < position.length; i++) {  //printet das Spielbrett
            for (int j = 0; j < position[i].length; j++) {
                System.out.print(position[i][j] + " ");
            }
            System.out.println();
        }
        return positionsbezeichnung;
    }
}
