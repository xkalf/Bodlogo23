import java.util.Scanner;

public class Bodlogo23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    int sum = 0;
    for (int i = 1; i < n; i++) {
      if(n % i == 0) sum += i;
    }
    if(sum == n) System.out.println("tugs too");
    else System.out.println("tugs too bish");
  }
}
