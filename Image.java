import java.awt.*;
import javax.swing.*;
public class Image extends JFrame
{
  private ImageIcon bild;
  private JLaben anzeige;
  
  public Image ()
  {
    setLayout(new FlowLayout());
    
    bild = new ImageIcon (getClass().getResource(""));  //in die Anfuehrungszeichen kommt der Dateiname rein
    anzeige = new JLabel(bild);
    add (anzeige);
    }
}