public class test_L2Q4{
	public static void main (String args[]) {
		int x = 1;
		
		System.out.println("Divided by 3 or 5:");
		while (x <= 50) {
			if (x % 3 == 0 || x % 5 == 0) {
				System.out.print(x + " ");
			}
			x++;
		}
		System.out.println();
		
		System.out.println("Divided by both 3 and 5:");
		while (x <= 50) {
			if (x % 3 == 0 && x % 5 == 0) {
				System.out.print(x + " ");
			}
			x++;
		}
	}
}