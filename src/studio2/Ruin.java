package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("How much money do you want to start with? ");
		int startAmount = in.nextInt();

		System.out.println("What is the probablity that you win a single play? ");
		double winChance = in.nextDouble();

		System.out.println("What is your win limit? ");
		int winLimit = in.nextInt();

		int simulation = 1;

		int moneyAmount = (startAmount);
		
		while (moneyAmount > 0 && moneyAmount < winLimit) {
			int gambleAmount = (int) (Math.random()*2);
			if (gambleAmount == 0)
			{
				gambleAmount = gambleAmount - 1;
			}
			moneyAmount = (moneyAmount + gambleAmount);
			System.out.println("Simulation " + simulation++ + ": " + moneyAmount);
			if (moneyAmount == winLimit)
			{
				int totalsimulations = simulation;
				System.out.println("Simiulations " + simulation + ": " + totalsimulations + " WIN");
				
			}

		}



		// TODO Auto-generated method stub

	} 

}
