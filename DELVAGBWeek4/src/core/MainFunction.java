package core;

public abstract class MainFunction {
	public static boolean isPrimeNumber(int number)
	{
		for (int i = 2; i <= (int) Math.floor(Math.sqrt((double)number)); i++)
		{
			if (number % i == 0)
				return false;
		}
		return true;
	}
	
	public static int PGCD(int a, int b)
	{
		while (a != b) {
			if (a > b)
				a -= b;
			else
				b -= a;
		}
		return a;
	}
	
	public static int PGCD(int [] array)
	{
		if (array.length >= 2) {
			int result = PGCD (array[0], array[1]);
			for (int i = 2; i < array.length; i++) {
				result = PGCD (result, array[i]);
			}
			
			return result;
		}
		return -1;
	}
	
	public static int PPMC (int a, int b)
	{
		int result = -1;
		if (a < b)
		{
			int temp = a;
			a = b;
			b = temp;
		}
		for (int i = 1; i <= b; i++) {
			result = a * i;
			if (result % b == 0)
				break;
		}
		
		return result;
	}
	
	public static int PPMC(int [] array)
	{
		if (array.length >= 2) {
			int result = PPMC (array[0], array[1]);
			for (int i = 2; i < array.length; i++) {
				result = PPMC (result, array[i]);
			}
			
			return result;
		}
		return -1;
	}
	
	public static int factoriel(int n)
	{
		if (n == 0 || n == 1)
			return 1;
		else {
			return n * factoriel(n - 1);
		}
	}
	
	public static boolean BinarySearch(int array[], int target, int left, int right)
	{
		Tools.bubbleSort(array);
		int middle = (left + right) /2;
		if (target == array[middle]) 		
			return true;
		if (left > right) {
			return false;
		}
		
		if (target < array[middle]) {
			return BinarySearch(array, target, left, middle - 1);
		}
		else {
			return BinarySearch(array, target, middle + 1, right);
		}
	}
}
