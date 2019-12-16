public class swapNumPractive{
	public static int swapNum(int num1, int num2) {
		return num1;
	}
	
	public static void main (String args[]) {
		int a = 5, b = 10;
		System.out.println("Before swapping: a, b = " + a + ", " + b);
		a = swapNum(b, b = a);
		System.out.println("After swapping: a, b = " + a + ", " + b);
	}
	
}