public class WideningCasting {
	
	public static void main(String[] args) {
		
		int intValue = 100;
		long longValue = intValue;
		
		System.out.println("int value: " + intValue);
		System.out.println("long value after widening casting: " + longValue);
		
		float floatValue = longValue;
		System.out.println("float value after widening casting: " + floatValue);
		
		double doubleValue = floatValue;
		System.out.println("double value after widening casting: " + doubleValue);
	}
}