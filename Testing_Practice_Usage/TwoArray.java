public class TwoArray {
    public static void main(String args[]) {
      int arr[][] = new int[2][2];
      arr[0][0] = 1;
      arr[0][1] = 2;
      arr[1][0] = 3;
      arr[1][1] = 4;
      for (int i = 0; i < 2; i++){
          for (int j = 0; j < 2; j++){ //Loop until all arr[i] is used
              System.out.print(arr[i][j] + " ");
          }
          System.out.println(); //print blank line after arr[i] changed
      }
    }
}
