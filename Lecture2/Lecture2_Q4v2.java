
public class Lecture2_Q4v2 {
	public static int x = 1;
	
	public static void result1() {
		System.out.println("Divided by 3 or 5:");
		for (int x = 1; x <= 50; x++) {
			if (x % 3 == 0 || x % 5 == 0) {
				System.out.print(x + " ");
			}
		}
	}
		
	public static void result2() {
		System.out.println("Divided by both 3 and 5:");
		for (int x = 1; x <= 50; x++) {
			if (x % 3 == 0 && x % 5 == 0) {
				System.out.print(x + " ");
			}
		}
	}
	
	public static void main (String args[]) {
		result1();
		System.out.println();
		result2();
	}
}
