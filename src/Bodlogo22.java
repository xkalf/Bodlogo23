public class Bodlogo22 {
  public static void main(String[] args) {
    for (int i = 2; i < 1001; i++) {
      boolean anhniiToo = true;
      for (int j = 2; j < i; j++) {
        if(i % j == 0) {
          anhniiToo = false;
          break;
        }
      }
      if(anhniiToo == true) System.out.println(i);
    }
  }
}
