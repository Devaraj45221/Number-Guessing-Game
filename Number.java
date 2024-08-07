package intern1;

import java.util.Random;
import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
//		to run0 the function or to play again
		random();
	}
	
	public static void random() {
//		create the object for random class number
		Random rn=new Random();
//		Range of the random number
		int randomNumber=rn.nextInt(100);
//		number(int num) is a parameter method to validate the random number
		number(randomNumber);
	}
	public static void number(int num) {
//		scanner class for input
		Scanner sc=new Scanner(System.in);
//		to know the random number
//		System.out.println("Random number is " +num);
		
//		Game start from here
		System.out.println();
		System.out.println("		Welcome to Number Guessing Game	");
		System.out.println();
		System.out.println("	All The Best");
		System.out.println();
		System.out.print("Enter your Guessing Number (1-100): ");
		System.out.print("");
		
//		input value assigning into a variable
		int guess=sc.nextInt();
//		Number of attempts to count
		int tries=1;

//		input validation
//		Check the number between the range
		if(guess>0 && guess<100) {
			
//		Repeat the process until the user guess the correct number
		
		while(guess>0 || guess<100) {
//			increasing the number of attempts
			
//			Giving the Condition to no. of attempts 
			if(tries!=5) {
				if(guess>num) {
					tries++;
					System.out.println();
					System.out.println("The guessing number is higher");
					System.out.print("Guess again: ");
					guess=sc.nextInt();
					
				}
				if(guess<num) {
					tries++;
					System.out.println();
					System.out.println("The guessing number is lower");
					System.out.print("Guess again: ");
					guess=sc.nextInt();
					
				}
				if(guess==num) {
					System.out.println();
					System.out.println("Correct answer. You Won!");
					System.out.print("Number of Attempts: "+(tries));
					System.out.println();
					int score = 100/tries;
					System.out.println("Your Score : "+ score +" out of 100");
					break;
				}
			}
			else {
				System.out.println("Maximum Tries are Reached");
				tries=1;
				break;
			}
		}
		}
		else {
			System.out.print("The range is out of bound.");
			System.out.println();
		}
		
		
//		Play again or exit
		System.out.println();
		System.out.println("Press 1 to Play Again: ");
		System.out.print("Press any number to EXIT: ");
		System.out.print("");

//		Play again
		int choice=sc.nextInt();;
		if(choice==1) {
			System.out.println();
			System.out.println("Play Again");
			System.out.println();
			random();
		}
//		Exit from the game
		else {
			System.out.println();
			System.out.println("Thank You");

		}
	}
	
}
