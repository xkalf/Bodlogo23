import java.util.Scanner;

public class Bodlogo21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    for (int i = 2; i < n; i++) {
      if(n % i == 0) System.out.println(i);
    }
  }
}
