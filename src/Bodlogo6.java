import java.util.Scanner;

public class Bodlogo6 {
  public static void main(String[] args) {
    double sum = 0;
    for (int i = 0; i < 5; i++) {
      Scanner myObj = new Scanner(System.in);
      double input = Double.parseDouble(myObj.nextLine());
      sum += input;
      myObj.close();
    }
    System.out.println(sum / 5);
  }
}
