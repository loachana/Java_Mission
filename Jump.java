public class Jump {
	
	public static void main(String[] args) {
		
		System.out.println("Using break statemtnt:");
		
		for (int i = 1; i <= 10; i++) {
			
			if (i == 5) {
				System.out.println("Breaking out of loop at i = "+i);
				break;
			}
			System.out.println("Iteration "+i);
			
		}
		
		System.out.println("\nUsing continue statemtnt: ");
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				System.out.println("Skipping iteration at i = " + i);
				continue;
			}
			System.out.println("Iteration "+i);
			
		}
		
		System.out.println("\nUsing return statemtnt in a method: ");
		int result = findSquare(4);
		System.out.println("Square of 4 is: "+result);
		
		int number = 10;
		System.out.println("Calling returnExample with number = " + number);
		returnExample(number);
	}
	
	public static int findSquare(int num) {
		return num*num; //Returns square
	}
	
	public static void returnExample(int num) {
		
		if (num == 10) {
			System.out.println("Number is 10, returning early.");
			return;
		}
		System.out.println("This will not be printed");
	}
}