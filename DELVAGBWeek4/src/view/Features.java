package view;
import core.*;

import java.util.Scanner;

public abstract class Features {
	
		public static void menu()
		{
			Scanner read_int = new Scanner(System.in);
			int choix = 0;
			
			System.out.println("Welcome to my program!\n\n");
			System.out.println("Please choose one of these options below");
			System.out.println("1- Test if a number is a prime number\n2- Compute the factorial of a number");
			System.out.println("3- Compute the Greatest Commun Divisor of a list of numbers\n4- Compute the Smallest Common Multiple of a list of numbers");
			System.out.println("5- Search for a number in an array using binary sort\n6- Manage a Stack");
			
			do{
				System.out.println("Choose one of these options");
				choix = read_int.nextInt();
				
			}while (choix < 1 || choix > 6);
			
			switch (choix) {
			case 1:
				Tools.testPrimeNumber();
				break;
			case 2:
				Tools.computeFactorial();
				break;
			case 3:
				Tools.computeGCD();
				break;
			case 4:
				Tools.computeSCM();
				break;
			case 5:
				Tools.searchNumber();
				break;
			case 6:
				Tools.manageStack();
			}
			
		}
}
