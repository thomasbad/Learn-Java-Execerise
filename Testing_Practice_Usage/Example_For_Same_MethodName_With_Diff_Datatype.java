public class Example_For_Same_MethodName_With_Diff_Datatype {
    public static int sum(int val1, int val2){
        int result = val1 + val2;
        return result;
    }
    
    public static double sum(double val1, double val2){
        double result = val1 + val2;
        return result;
    }
    
    public static void main(String args[]) {
      int a = 10;
      int b = 20;
      double c = 10.5;
      double d = 20.5;
      
      int ans1 = sum(a, b);
      System.out.println("integer Sum = " + ans1);
      double ans2 = sum(c, d);
      System.out.println("double Sum = " + ans2);
    }
}
