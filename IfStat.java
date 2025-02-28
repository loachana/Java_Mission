import java.util.Scanner;

public class IfStat {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		
		if (age < 18) {
			System.out.println("You are youth!");
		} else if (age >= 18 && age < 60) {
			System.out.println("You are adult!");
		} else {
			System.out.println("You are senior!");
		}
		
		
		scanner.close();
	}
}
