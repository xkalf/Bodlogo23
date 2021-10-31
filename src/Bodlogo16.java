import java.util.Scanner;

public class Bodlogo16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double tsalin = Double.parseDouble(sc.nextLine()); 
    tsalin *= 0.85;
    if(tsalin >= 900000) {
      System.out.println("Chadna");
    } else {
      System.out.println("Chadahgui");
    }
    sc.close();
  }
}
