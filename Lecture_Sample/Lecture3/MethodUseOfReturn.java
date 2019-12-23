package Lecture3;
public class MethodUseOfReturn {
    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
    
    public static void main(String args[]) {
      int result = sum(10, 20);
      System.out.println("The sum is: " + result);
    }
}
