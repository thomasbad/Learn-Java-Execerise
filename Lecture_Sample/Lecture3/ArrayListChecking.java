package Lecture3;
public class ArrayListChecking {
    public static void main(String args[]) {
      int arr[] = {11, 22, 33, 44};
      System.out.println("Using arr.length method: " + arr.length);
      System.out.println("Real Array Length: " + (arr.length - 1));
      for (int i = 0; i < arr.length; i++){
          System.out.print("Index = " + i);
          System.out.println(", value = " + arr[i]);
      }
    }
}
