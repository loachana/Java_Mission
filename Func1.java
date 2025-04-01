import java.util.Scanner;

public class Func1{
	
	public static int addNumbers(int a, int b) {
		
		return a + b;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first num: ");
		
		int num_1 = scan.nextInt();
		
		System.out.println("Enter second num: ");
		
		int num_2 = scan.nextInt();
		
		int result = addNumbers(num_1, num_2);
		
		System.out.println("The sum is: " + result);
		
		scan.close();
	}
}