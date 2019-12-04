//calculate the perimeter and area of a circle with constant value with radius 3.5
public class Lecture1_Q4{
    //set constant variable of radius
    public static final double radius = 3.5;
    public static final double pie = 3.14;

    public static void main(String args[]){
        //cal the perimeter and area of the circle
        Double perr = radius * pie * 2;
        Double areaa = radius * radius * pie;

        //print result
        System.out.println("Perimeter: " + perr);
        System.out.println("Area: " + areaa);
    }
}