public class ExeptionHandlingExample {
	
	public static void main(String[] args) {
		
		try {
			int result = 10/0;
			System.out.println("The result is: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed. ");
		} finally {
			System.out.println("Finally block executed.");
		}
		
		String text = null;
		
		try {
			System.out.println(text.length());
		} catch (NullPointerException e) {
			System.out.println("Error: Can not call method on a null object.");
		} finally {
			System.out.println("Finally block for null pointer exception executed.");
		}
	}
}