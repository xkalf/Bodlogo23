import java.util.Scanner;

public class Bodlogo19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    for (int i = 1; i <= n; i++) {
      if(i % 2 == 1) System.out.println(i);
    }
  }
}
