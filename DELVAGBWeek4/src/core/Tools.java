package core;
import java.util.Scanner;

public abstract class Tools {
	
	//Function which displays an array
			public static void displayArray(int [] array)
			{
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i] + "  ");
				}
			}
			
			//Function which creates and returns an array of integer
			public static int[] createArray()
			{
				Scanner read = new Scanner(System.in);
				System.out.println("Enter the number of element you want to put in the array.");
				int size = read.nextInt();
				
				while (size < 0) {
					System.out.println("Enter a positive number.");
					size = read.nextInt();
				}
				
				int [] array = new int[size];
				for (int i = 0; i < array.length; i++) {
					System.out.print("Enter the element of position " + (i + 1) + "  ");
					array[i] = read.nextInt();
				}
				System.out.println();
				return array;
			}
	
	public static void bubbleSort(int [] array)
	{
		bubbleSort(array, "ASC");
	}
	
	public static boolean isNotInOrder(int a, int b, String order)
	{
		if (order.equals("ASC"))
			return a > b;
		else
			return a < b;
	}
	
	//Function which swaps two element in a given array
	public static void swap(int [] array, int a, int b)
	{
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	//Function which uses the bubble sort algorithm to sort a given array in any order
	public static void bubbleSort(int [] array, String order)
	{
		int m, j;
		for (int i = 0; i < array.length - 1; i++) {
			for (j = i + 1; j < array.length; j++) {
				if (isNotInOrder(array[i], array[j], order)) {
					swap(array, i, j);
				}
			}
		}
	}
	
	
	public static int inputInteger()
	{
		Scanner read_int = new Scanner(System.in);
		int number = 0;
		
		System.out.print("Enter a number : ");
		number = read_int.nextInt();
		
		return number;
	}
	public static void testPrimeNumber()
	{
		int number = inputInteger();
		boolean result = MainFunction.isPrimeNumber(number);
		if (result)
			System.out.println(number + " is a prime number");
		else
			System.out.println(number + " is not a prime number");
	}
	
	public static void computeFactorial()
	{
		int number = inputInteger();
		int result = MainFunction.factoriel(number);
		
		System.out.println("The factorial of " + number + " is " + result);
	}
	
	public static void computeGCD()
	{
		System.out.println("This function needs a list of number");
		int [] array = createArray();
		
		int result = MainFunction.PGCD(array);
		
		System.out.print("The PGCD of these numbers : ");
		displayArray(array);
		System.out.println("is " + result);
	}

	public static void computeSCM() {
		System.out.println("This function needs a list of number");
		int [] array = createArray();
		
		int result = MainFunction.PGCD(array);
		
		System.out.print("The PGCD of these numbers : ");
		displayArray(array);
		System.out.println("is " + result);
	}

	public static void searchNumber() {
		System.out.println("This function needs a list of number");
		int [] array = createArray();
		
		System.out.println("Enter an integer to test if it is in the array.");
		int number = inputInteger();
		
		boolean result = MainFunction.BinarySearch(array, number, 0, array.length - 1);
		
		if (result)
			System.out.println(number + " is found in the array");
		else
			System.out.println(number + " is not found in the array");
		
	}

	public static void manageStack() {
		Stack stack = new Stack();
		boolean okay = false;
		System.out.println("Add the first element in the stack");
		int number = inputInteger();
		stack.push(number);
		do {
			System.out.println("Please make a choice :\n1- Put an element in the stack\n2- Remove an element in the stack\n3- Print the top element in the stack");
			number = inputInteger();
			while (number < 1 || number > 3) {
				System.out.println("Please make a choice :\n1- Put an element in the stack\n2- Remove an element in the stack\n3- Print the top element in the stack");
				number = inputInteger();
			}
			
			switch (number)
			{
				case 1:
					number = inputInteger();
					stack.push(number);
					break;
				case 2:
					stack.pop();
					break;
				case 3:
					System.out.println("The top element of the stack is : " + stack.peek());
					break;	
			}
			
			System.out.println("Please enter 1 if you want to continue testing the functionnalities of the stack.");
			number = inputInteger();
			
			if (number == 1)
				okay = true;
			else
				okay = false;
			
			System.out.println("\n\n\n\n");
		} while (okay);
	}
}