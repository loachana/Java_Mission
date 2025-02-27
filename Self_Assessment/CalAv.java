import java.util.Scanner;

public class CalAv {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		float firstnumber = scanner.nextFloat();
		
		System.out.println("Enter the second number");
		float secondnumber = scanner.nextFloat();
		
		float avg = (firstnumber + secondnumber)/2;
		
		
		System.out.println("Average is: " + avg);
		
		scanner.close();
		
	}
}