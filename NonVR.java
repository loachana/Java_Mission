public class NonVR {
	
	public int add(int a, int b) {
		
		return a + b;
	}
	
	public static void main(String[] args) {
		
		NonVR obj = new NonVR();
		int result = obj.add(5, 10);
		System.out.println("sum: " + result);
		
	}
}