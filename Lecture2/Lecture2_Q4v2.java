public class Lecture2_Q4v2 {
	public int x = 1;
	
	public void result1() {
		System.out.println("Divided by 3 or 5:");
		while (x <= 50) {
			if (x % 3 == 0 || x % 5 == 0) {
				System.out.print(x + " ");
			}
			x++;
		}
	}
		
	public void result2() {
		System.out.println("Divided by both 3 and 5:");
		while (x <= 50) {
			if (x % 3 == 0 && x % 5 == 0) {
				System.out.print(x + " ");
			}
			x++;
		}
	}
	
	public static void main (String args[]) {
		Lecture2_Q4v2 a = new Lecture2_Q4v2();
		Lecture2_Q4v2 b = new Lecture2_Q4v2();
		a.result1();
		System.out.println();
		b.result2();
	}
}
