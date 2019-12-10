public class Lecture1_Q5v3{
    public static void main(String args[]){
    	//do it as one stage without break it into 3 objects
        int a, b, dummy;
        a = 5;
        b = 10;
        System.out.println("Before swapping: a, b = " + a + ", " + b);
        dummy = a;
        a = b;
        b = dummy;
        System.out.println("After swapping: a, b = " + a + ", " + b);
    }
}