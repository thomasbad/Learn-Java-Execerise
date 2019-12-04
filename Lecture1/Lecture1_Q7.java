//import thr java util Scanner for input usage
import java.util.Scanner;
    public class Lecture1_Q7{
        public static void main(String args[]){

            //Reserve a memory slot for input data
            Scanner input1 = new Scanner(System.in);
            Scanner input2 = new Scanner(System.in);

            //The lines before input slot for user
            System.out.print("Enter 1st number: ");
            //assign object id for user's input and where the input allocated to the reserved mem slot
            double num1 = input1.nextDouble();
            //2nd numbers input for the same
            System.out.print("Enter 2nd number: ");
            double num2 = input2.nextDouble();

            //Print out final result
            System.out.print("num1");
            System.out.print(" x ");
            System.out.print("num2");
            System.out.println(" = " + num1 * num2);

            //Close the used mem slot, won't affect the result but always remember it to avoid res leak
            input1.close();
            input2.close();
        }
    }