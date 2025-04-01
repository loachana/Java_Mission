public class StaticExample {
	
	static int counter = 0;
	
	public void incrementCounter() {
		
		counter++;
	}
	
	public static void main(String[] args) {
		
		StaticExample obj1 = new StaticExample();
		StaticExample obj2 = new StaticExample();
		
		obj1.incrementCounter();
		obj2.incrementCounter();
		
		System.out.println("Counter value: " + StaticExample.counter);
	}
}