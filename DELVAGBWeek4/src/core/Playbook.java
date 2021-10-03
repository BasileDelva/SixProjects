package core;
import view.*;

public class Playbook {
	public static void main(String[] args)
	{
		Features.menu();
		System.out.println("\n\nPlease enter 1 if you want to continue testing the functionnalities of the stack.");
		int number = Tools.inputInteger();
		
		if (number == 1)
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\\n\\n\\n");
			main(args);
		}
	}
}
