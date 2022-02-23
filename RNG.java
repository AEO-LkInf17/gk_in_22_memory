import java.util.Random;
public class RNG {
  public static int randomNumberGenerator(int min, int max) {
    Random r = new Random();
    int randomNum = r.nextInt(max - min);
    int result = randomNum + min;
    return result;
  }
  public static void main(String[] args) {
    int randomNum1 = randomNumberGenerator(1, 5);
    int randomNum2 = randomNumberGenerator(10, 20);
    System.out.println(randomNum1);
    System.out.println(randomNum2);
  }
}
