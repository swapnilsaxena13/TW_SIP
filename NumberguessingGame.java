package com.access;
import java.util.Random;
import java.util.Scanner;
public class NumberguessingGame {

	public static void main(String[] args) {
		Random rand=new Random();
		int randomNumber=rand.nextInt(100)+1;//This random number will be between 0 to 100 so to take a number between 1 to 100 we add 1
		//System.out.println("random Number is "+ randomNumber);
		int tryCount=0;
		
		  while(true) {
		System.out.println("Enter your Guess between 1-100 :");
		
		Scanner scanner =new Scanner(System.in);
		int playerGuess = scanner.nextInt();
		tryCount++;
		
		if(playerGuess==randomNumber) {
			System.out.println("Correct! You Win");
			System.out.println("It took you "+ tryCount +" tries");
			break;
			
		}
		else if(randomNumber > playerGuess) {
			System.out.println("Nope!The Number is Greater. Guess again.");
		}
		else {
			System.out.println("Nope!The Number is Smaller. Guess again.");
		}
	} 
		}
}
