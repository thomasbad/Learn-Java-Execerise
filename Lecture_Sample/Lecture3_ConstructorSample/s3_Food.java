package Lecture3_ConstructorSample;

//Constructor sample 1
public class s3_Food {
	//Constructor
	s3_Food(){ //constuctor must be the same name as its class name
		System.out.println("This is Food");
	}
	
	public static void main (String args[]) {
		s3_Food obj = new s3_Food();
		s3_Food objB = new s3_Food();
	}
}