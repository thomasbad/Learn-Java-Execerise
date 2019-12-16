public class Lecture2_Q3 {
	public static void main(String args[]) {
		int n = 10;
		while (n != 1) {
			System.out.println("Current n: " + n);
			if (n % 2 == 0) {
				n = n / 2;
				System.out.println("New n: " + n);
			}else {
				n = n * 3 + 1;
				System.out.println("New n: " + n);
			}
		}
	}
}
