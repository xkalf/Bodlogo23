import java.util.Random;

public class Bodlogo15 {
  public static void main(String[] args) {
    for (int i = 0; i < 30; i++) {
      Random rand = new Random();
      int randomNumber = rand.nextInt(8);
      System.out.println(randomNumber);
    }
  }
}
