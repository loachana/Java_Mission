import java.util.Scanner;

public class ExHand {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your score: ");
		
		try {
			int score = scan.nextInt();
			
			if (0 <= score && score <= 100) {
				if (75 <= score && score <= 100) {
					System.out.println("A");
				}else if(65<= score && score <= 74){
					System.out.println("B");
				}else if(55<= score && score <= 64) {
					System.out.println("C");
				}else if(45 <= score && score <= 54) {
					System.out.println("S");
				}else{
					System.out.println("Fail");
				}
			} else {
				System.out.println("Out of range");
			}
		} catch(Exception e) {
				System.out.println("error");
		}
		
		
		
		
	}
}