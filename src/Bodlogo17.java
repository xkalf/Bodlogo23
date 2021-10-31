import java.util.Scanner;

public class Bodlogo17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    int sum = n / 100 + n % 100 / 10 + n % 10;
    System.out.println(sum);
  }
}
