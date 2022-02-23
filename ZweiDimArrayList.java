import java.util.ArrayList; 
public class ZweiDimArrayList {
  public static void main(String[] args) {
    ArrayList<String>[][] felder = new ArrayList[4][5];
    felder[0][0] = new ArrayList<String>();
    
    felder[0][0].add("A1");
    felder[0][0].add("A2");
    felder[0][0].add("A3");
    felder[0][0].add("A4");
    felder[0][0].add("A5");
    
    felder[0][1] = new ArrayList<String>();
    felder[0][1].add("B1");
    felder[0][1].add("B2");
    felder[0][1].add("B3");
    felder[0][1].add("B4");
    felder[0][1].add("B5");
    } 
  }
}
