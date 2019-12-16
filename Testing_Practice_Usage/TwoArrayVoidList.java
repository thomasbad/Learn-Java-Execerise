public class TwoArrayVoidList {
    public static void main(String args[]) {
      int arr[][] = new int [3][];
      arr[0] = new int [2]; //Tell the system how many column exist in provided row
      arr[1] = new int [4];
      arr[2] = new int [3];
      
      int count = 1;
      
      for (int i = 0; i < arr.length; i++){ //setup array list
          for (int j = 0; j < arr[i].length; j++){
              arr[i][j] = count;
              count++; //count = count + 1;
          }
      }
      for (int i = 0; i < arr.length; i++){ //print the whole list
          for (int j = 0; j < arr[i].length; j++){
              System.out.print(arr[i][j] + " ");
          }
          System.out.println();
      }
    }
}
