

import java.util.Scanner;
public class ProductDetails {
	
	static void maxprice(int prices[]) {
		int max = prices[0];
		for(int i = 1; i < prices.length; i++) {
			if(max < prices[i]) {
				max = prices[i];
			}
		}
		System.out.println("Maximum Price: " + max);
	}
	
	static void minprice(int prices[]) {
		int min = prices[0];
		for(int i = 1; i < prices.length; i++) {
			if(min > prices[i]) {
				min = prices[i];
			}
		}
		System.out.println("Minimum Price: " + min);
	}
	
	static void avenum(int prices[]) {
		int aven = prices[0];
		for(int i = 1; i < prices.length; i++) {
			aven = aven + prices[i];
			}
		int result = aven / prices.length;
		System.out.println("Average Price: " + result);	
	}
	
	static void totalnum(int prices[]) {
		int totaln = prices[0];
		for(int i = 1; i < prices.length; i++) {
			totaln = totaln + prices[i];
		}
		System.out.println("Total Prices: " + totaln);
	}
	
	
	public static void main (String args[]) {
		Scanner obj = new Scanner(System.in);
		Scanner obj2 = new Scanner(System.in);
		int[] prices = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Please input " + (i + 1) + " price: ");
			int input = obj.nextInt();
			prices[i] = input;
		}
		
		
		System.out.println("\n\nOptions to Perform:\n------------------------\nA. Maximum\nB. Minimum\nC. Average\nD. Total");
		System.out.print("Your Option: ");
		String optk = obj2.nextLine();
		
		switch(optk) {
		case "A":
			maxprice(prices);
			break;
		case "B":
			minprice(prices);
			break;
		case "C":
			avenum(prices);
			break;
		case "D":
			totalnum(prices);
			break;
		default:
			System.out.println("Incorrect Options!");
		}
		obj.close();
		obj2.close();
	}
}
