public class Karte
{
  private byte kartenruecken;
  private byte motiv;
  private Spielbrett positionsbezeichnung; //2D-ArrayList
  private int seitenlaenge; //variiert je nach Spielbrett
  private boolean paarGefunden;
  
  public Karte (byte kartenruecken, byte motiv, Spielbrett position, int seitenlaenge, boolean paarGefunden)
  {
    this.kartenruecken = null;
    this.motiv = motiv;
    this.positionsbezeichnung = positionsbezeichnung; //zufaellig zugeteilt
    this.seitenlaenge = seitenlaenge;
    this.paarGefunden = false;
  }
  public int setSeitenlaenge(int neueSeitenlaenge)
  {
    this.seitenlaenge == neueSeitenlaenge;
  }
  public int setPosition(int neuePosition)
  {
    this.position == neuePosition;
  }
  public boolean setPaarGefunden()
  {
    if (Spielmechanik.vergleich() = true)
    {
      set this.paarGefunden = true;
    }
  }
}
