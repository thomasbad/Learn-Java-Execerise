public class swapTheNumv3Excerise {
    public static void swapNum(int a, int b){
        System.out.println("Enter Swap Method");
        System.out.println("Inside Swap Method & Before Swap, a = " + a + " and b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside Swap Method & After Swap, a = " + a + " and b = " + b);
    }
    
    public static void main(String args[]) {
      int a = 10;
      int b = 20;
      System.out.println("Inside Main & Before Swap, a = " + a + " and b = " + b);
      swapNum(a, b);
      System.out.println("Leaving Swap method");
      System.out.println("Inside Main & After Swap, a = " + a + " and b = " + b);
    }
}
