public class UseOfCollectAndReturn {
    static int[] collect(){
        return new int[] {1, 3, 5, 5, 7, 9, 11};
    }
    
    public static void main(String args[]) {
      int arr[] = collect();
      for (int i = 0; i < arr.length; i++){
          System.out.println(arr[i]);
      }
    }
}
