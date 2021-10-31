import java.util.Scanner;

public class Bodlogo13 {
  public static void TegshOloh(int num) {
      if(num % 2 == 0){
        System.out.println("Tegsh");
      } else {
        System.out.println("Sondgoi");
      }
  }
  public static void main(String[] args) {
      Scanner myObj = new Scanner(System.in);
      int input = Integer.parseInt(myObj.nextLine());
      TegshOloh(input);
      int input1 = Integer.parseInt(myObj.nextLine());
      TegshOloh(input1);
      myObj.close();
  }
}
