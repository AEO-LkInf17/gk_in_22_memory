import java.util.ArrayList; 
public class ZweiDimArrayList {
  public static void main(String[] args) {
    ArrayList<Integer>[][] felder = new ArrayList[4][5];
    int n = 1;
    for (int i = 0; i<felder[3].length; i++) {
      felder[0][0].add(n);
      n++;
    }
    System.out.println(felder); 
  }
}
