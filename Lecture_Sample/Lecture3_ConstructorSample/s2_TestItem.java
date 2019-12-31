//Sample 2: Method cross thu var from field - data input
package Lecture3_ConstructorSample;

public class s2_TestItem {
	public static void main (String args[]) {
		s2_item productA = new s2_item(); //cross with item.java from 1.3 in same package
		s2_item productB = new s2_item();
		
		productA.addItem("Apple", 10);
		productB.addItem("Banana", 20);
		
		productA.showInformation();
		productB.showInformation();
	}
}
