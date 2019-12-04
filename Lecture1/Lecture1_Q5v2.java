//should be what this question is asking for like this?
public class Lecture1_Q5v2{
    //make needed value in instant var
    public static int a = 5, b = 10;

    //make a function to do the swapping and output after result, create temp as int object ref to int a
    public static void swapNum(){
        int temp = a;
        a = b;
        b = temp;
    }
    //print original result and call after swap effect
    public static void main(String args[]){
        System.out.println("Before Swapping: " + a + ", " + b);
        swapNum();
        System.out.println("After Swapping: " + a + ", " + b);
    }
}