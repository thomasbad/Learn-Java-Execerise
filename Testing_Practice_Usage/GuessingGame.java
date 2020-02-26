

import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
	public static void main(String args[]) {
		Random randomnum = new Random();
		int answer = randomnum.nextInt(99);
		Scanner obj = new Scanner(System.in);
		int guessnum;
		int i = 0;
		
		
		System.out.println("Guess a number between 0 and 99");
		while(i <= 4){
			i++;
			System.out.print("Your Guess: ");
			guessnum = obj.nextInt();
			
			if(guessnum > answer) {
				System.out.println("Correct guess should be smaller then " + guessnum);
			}else if(guessnum < answer) {
				System.out.println("Correct guess should be larger then " + guessnum);
			}else if(guessnum == answer){
				System.out.println("You are Correct! You get a price!");
				return;
			}
		}
		System.out.println("Correct Number: " + answer);
		System.out.println("Try Again Later!");
	}
}