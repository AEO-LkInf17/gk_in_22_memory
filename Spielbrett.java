package de.aeo.memeory;

import java.util.ArrayList;
import java.util.Arrays;

public class Spielbrett {

    private int hintergrund;
    public int positionsbezeichnung;

    public Spielbrett(int hintergrund) {
        this.hintergrund = 0;
        this.positionsbezeichnung = 0;
    }

    public int setHintergrund(byte neuerHintergrund) {
        return this.hintergrund = neuerHintergrund;
    }

    public String toString() {
        return this.positionsbezeichnung + "";
    }

    public void setPositionsbezeichnung() {
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

    public int getPositionsbezeichnung() {
        return this.positionsbezeichnung;
    }
}
