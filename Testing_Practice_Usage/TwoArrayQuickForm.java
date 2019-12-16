public class TwoArrayQuickForm {
    public static void main(String args[]) {
      int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; //set Array for arr[0][1-3], arr[1][1-3] & arr[2][1-3]
      for (int i = 0; i < 3; i++){
          for (int j = 0; j < 3; j++){
              System.out.print(arr[i][j] + " ");
          }
          System.out.println();
      }
    }
}
