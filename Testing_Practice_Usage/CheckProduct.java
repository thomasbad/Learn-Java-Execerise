

import java.util.Scanner;
public class CheckProduct {
	public static void main (String args[]) {
		String[] products = {"apples","banana","oranges","milk","coke","potato chips","juice"};
		Scanner inpk = new Scanner(System.in);
		System.out.print("Product for Searching: ");
		String prodname = inpk.nextLine();
		prodname = prodname.toLowerCase();		
		
		for(int i = 0; i < products.length; i++) {
			if(prodname.equals(products[i])) {
				System.out.println(prodname + " exists");
				return;
			}
		}
		System.out.println(prodname + " does not exists");
	}
}
