public class Arrays {
	
	public static void main(String[] args) {
		
		String[] names = {"a", "b", "c", "d"};
		
		System.out.println("Names in the array:");
		
		for (int i=0; i < names.length; i++) {
			
			System.out.println(names[i]);
		}
		System.out.println(names.length);
	}
}