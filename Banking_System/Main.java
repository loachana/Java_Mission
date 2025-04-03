import java.util.Scanner;

public class Main {
	
	//Function to check balance
	public static void checkBalance(double balance) {
		System.out.println("Current balance: $" + balance);
	}
	
	//Function to deposit money
	public static double deposit(double balance, double depositAmount) {
		if (depositAmount <= 0) {
			throw new IllegalArgumentException("Deposit amount must be positive.");	
		}
		balance += depositAmount;
		System.out.println("Ddeposited $" + depositAmount);
		return balance;		
	}
	
	//Function to withdraw money
	public static double withdraw(double balance, double withdrawalAmount) {
		if (withdrawalAmount <= 0) {
			throw new IllegalArgumentException("Withdrawal amount must be positive.");
		}
		if (withdrawalAmount > balance) {
			throw new IllegalArgumentException("Insufficient funds for this transaction.");
		}
		
		balance -= withdrawalAmount;
		System.out.println("Withdrew $" + withdrawalAmount);
		return balance;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double balance = 1000.0;
		int choice;
		
		do {
			//Display menu options
			System.out.println("\nBanking Application Menu:");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			
			choice = scanner.nextInt();
			
			switch (choice) {
				case 1:
					checkBalance(balance);
					break;
				case 2:
					System.out.println("Enter deposit amount: $");
					double depositAmount = scanner.nextDouble();
					try {
						balance = deposit(balance, depositAmount);
						checkBalance(balance);
					} catch (IllegalArgumentException e) {
						System.out.println("Error: " + e.getMessage());
					}
					break;
				case 3:
					System.out.println("Enter withdrawal amount: $");
					double withdrawalAmount = scanner.nextDouble();
					try {
						balance = withdraw(balance, withdrawalAmount);
						checkBalance(balance);
					} catch (IllegalArgumentException e) {
						System.out.println("Error: " + e.getMessage());
					}
					break;
				case 4:
					System.out.println("Exiting application. Goodbye!");
					break;
				default:
					System.out.println("Invalid choice, please try again.");
		
			}
			
		} while(choice != 4);
		
		scanner.close();
	
	}
	
}