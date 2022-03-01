public class Position {
  private int positionsbezeichnung;
  public int setPositionsbezeichnung() {
    int e = 0;
    int [][] position = new int[4][5];
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        position [i][j] = e;
        e++;
        System.out.println(position[i][j]);
      }
    }
    return e;
  }
}
