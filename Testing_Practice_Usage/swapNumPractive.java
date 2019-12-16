import java.util.Scanner;

public class swapNumPractive {
	public static void main(String args[]) {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.print("Please input your 1st number: ");
		int num1 = input1.nextInt();
		System.out.print("Enter 2nd number: ");
		int num2 = input2.nextInt();
		System.out.print("The mutiply result of 1st number: " + num1 + " and the 2nd number: " + num2 + "is = ");
		System.out.println(num1 * num2);
		input1.close();
		input2.close();
	}
}