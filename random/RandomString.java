import java.util.ArrayList;
import java.util.Random;
public class RandomString {
  public static void main(String[] args) {
    ArrayList<String> feld = new ArrayList<String>();
    feld.add("A1");
    feld.add("A2");
    feld.add("B1");
    feld.add("B2");
    feld.add("C2");
    feld.add("A3");
    feld.add("A4");
    feld.add("B3");
    feld.add("B4");
    feld.add("C1");
    System.out.println(feld);
    Random r = new Random();
    System.out.println(feld.get(r.nextInt(feld.size())));
  } 
}
