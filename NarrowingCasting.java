public class NarrowingCasting {
	
	public static void main(String[] args) {
		
		double doubleValue = 123.454;
		System.out.println("Original double value: " + doubleValue);
		
		float floatValue = (float) doubleValue;
		System.out.println("Narrowed to float: " + floatValue);
		
		long longValue = (long) floatValue;
		System.out.println("Narrowed to long: " + longValue);
		
		int intValaue = (int) longValue;
		System.out.println("Narrowed to int: " + intValaue);
		
		short shortValue = (short) intValaue;
		System.out.println("Narrowed to short: " + shortValue);
		
		byte byteValue = (byte) shortValue;
		System.out.println("Narrowed to byte: " + byteValue);
		
	}
}