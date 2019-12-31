//Sample 2: Method cross thu var from method - method
package Lecture3_ConstructorSample;

public class s2_item {

	//Fields
		String name;
		int price;
		
		//Methods
		void addItem(String a, int b) {
			name = a;
			price = b;
		}
		
		void showInformation() {
			System.out.println("Item is = " + name + "and the price is " + price);
		}
	}
