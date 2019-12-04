public class Lecture1_Q5{
    //TODO: why swapNum works in this method? Internet advise this is not okay for production code, why?
    //make a static object called "swapNum" to do swapping int function 
    public static int swapNum(int firstNum, int secNum){
        return firstNum;
    }
    //main program to use swap function
    public static void main(String args[]){
        //set int value
        int a = 5;
        int b = 10;
        //print out the original setting first
        System.out.println("Before swapping: a, b = " + a + ", " + b);
        //swapping value by using created object "swapNum", tell the program a=b, and at the same time b = a after ","
        a = swapNum(b,b = a);
        //print swapped result
        System.out.println("After swapping: a, b = " + a + ", " + b);
    }
}

/* Original article explain this method:
While it is not possible to write a function that simply swaps two variables, 
it is possible to write a helper function that allows you to:

- Swap two variables using only one statement
- Without temporary variables in the caller's code
- Without 'boxing' primitives
- With a few overloads (one of them using generics), it works for any type

That's how you could do it:

    int returnFirst(int x, int y) {
        return x;
    }
    int a = 8, b = 3;
    a = returnFirst(b, b = a); // try reading this as a = b; b = a;
    System.out.println("a: " + a + ", b: " + b); // prints a: 3, b: 8

This works because the Java language guarantees (Java Language Specification, Java SE 7 Edition, section 15.12.4.2) that 
all arguments are evaluated from left to right (unlike some other languages, where the order of evaluation is undefined), 
so the execution order is:

1. The original value of b is evaluated in order to be passed as the first argument to the function
2. The expression b = a is evaluated, and the result (the new value of b) is passed as the second argument to the function
3. The function executes, returning the original value of b and ignoring its new value
4. You assign the result to a
If returnFirst is too long, you can choose a shorter name to make code more compact (e.g. a = sw(b, b = a)). 
Use this to impress your friends and confuse your enemies :-)
*/

/* Another simple explain from internet with more generic explain:
    int swap(int a, int b) {  //usage: y = swap(x, x=y);
        return a;
    }

    y = swap(x, x=y);

It relies on the fact that x will pass into swap before y is assigned to x, then x is returned and assigned to y.
You can make it generic and swap any number of objects of the same type:

    <T> T swap(T... args) {   // usage: z = swap(a, a=b, b=c, ... y=z);
        return args[0];
    }

    c = swap(a, a=b, b=c)
*/