public class Bodlogo3 {
  public static void main(String[] args) {
    int[] arr = new int[100];
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if(max < arr[i]) max = arr[i];
    }
    System.out.println(max);
  }
}
