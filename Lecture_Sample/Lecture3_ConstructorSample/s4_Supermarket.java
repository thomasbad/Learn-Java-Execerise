package Lecture3_ConstructorSample;

//Constructor sample 1

public class s4_Supermarket {
	//Fields
	String location;
	int product_number;
	
	//Constructors
	s4_Supermarket(String a, int b){
		location = a;
		product_number = b;
	}
	
	//Methods
	void displayInformation() {
		System.out.println("Supermarket is in " + location + " which has " + product_number + " products");
	}
	
	//Main
	public static void main (String args[]) {
		s4_Supermarket objA = new s4_Supermarket("HK Island", 100); // put value thu constructors
		objA.displayInformation(); //output thu methods
	}
}