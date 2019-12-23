package Lecture3;
public class FindMin {
    static void min(int arrz[]){ //create function
        int min = arrz[0]; //Assume min is the 1st element within array
        for (int i = 1; i < arrz.length; i++){ //Set compare with element start from 2nd one until arr.length is done 
            if (min > arrz[i]){ //Compare if original one bigger then compare one
                min = arrz[i]; //if original one is bigger, then replace the smaller new one
            }
        }
        System.out.println(min); 
    }
    
    public static void main(String args[]) {
        int arrr[] = {10, 4, 5, 21}; //set array list
        min(arrr); //used created function
    }
}
