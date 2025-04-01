import java.util.Scanner;

public class Func{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num_1 = scan.nextInt();
		int num_2 = scan.nextInt();
		
		int sum = add1(num_1, num_2);
		
		System.out.println("The sum is "+sum);
		
		scan.close();
	}
	
	public int add1(int a, int b) {
		return a+b;
	} 
}