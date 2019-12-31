//Sample 1: Method cross thu var from field - data input
package Lecture3_ConstructorSample;

public class s1_TestAnimal {
	public static void main (String args[]) {
		s1_Animal dog = new s1_Animal();
		s1_Animal cat = new s1_Animal();
		
		//Fields
		dog.type = "Small Dog";
		dog.name = "Happy";
		dog.age = 2;
		
		cat.type = "Big Cat";
		cat.name = "Funny";
		cat.age = 3;
		
		System.out.println("----Dog----");
		System.out.println("Type: " + dog.type);
		System.out.println("Name: " + dog.name);
		System.out.println("Age: " + dog.age);
		
		System.out.println("----Cat----");
		System.out.println("Type: " + cat.type);
		System.out.println("Name: " + cat.name);
		System.out.println("Age: " + cat.age);
	}
}
