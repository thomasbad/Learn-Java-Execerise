public class Lecture2_Q1v2 {
	public static void main (String args[]) {
		int result = 0;
		int x = 1;
		while (x <= 20) {
			if (x % 2 == 1) {
				result = result + x;
			}
			x++;
		}
		System.out.println("Result: " + result);
	}
}
