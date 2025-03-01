public class Loops {
	
	public static void main(String[] args) {
		
		System.out.println("While Loop: ");
		
		int i = 1;
		
		while (i <= 5) {
			
			System.out.println("Iteration " + i);
			i++;
			
		}
		
		System.out.println("\nDo-While Loop: ");
		
		int j = 1;
		
		do {
			
			System.out.println("Iteration " + j);
			j++;;
		} while (j <= 5);
			
			System.out.println("\nFor Loop: ");
			
			for (int k = 1; k <= 5; k++) {
				
				System.out.println("Iteration " + k);
			}
	}
}