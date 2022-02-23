import java.util.ArrayList;
public class Spielbrett
{
  private byte hintergrund;
  private ArrayList<position> positionsbezeichnung = new ArrayList<>;
  
  public Spielbrett (byte hintergrund, int gitter, Arraylist positionsbezeichnung)
  {
    this.hintergrund = hintergrund;
    this.gitter = gitter;
    this.positionsbezeichnung = positionsbezeichnung;
  }
  public byte setHintergrund(byte neuerHintergrund)
  {
    this.hintergrund == neuerHintergrund;
  }
  public void getGitterbezeichnung()
  {
    return this.positionsbezeichnung;
  }
}
