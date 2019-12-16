public class DisplayArrayExample {
    static void displayArray(int arr[]){
        for (int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String args[]) {
      displayArray(new int[] {11, 22, 33, 44});
    }
}
