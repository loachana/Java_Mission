public class calculator {
	
	public static void main(String[] args) {
		
		//Prices of items
		int Item1 =25;
		int Item2 = 10;
		
		//Calculation
		int total_price = Item1 + Item2;
		int price_diff = Item1 - Item2;
		int mult = Item1 * Item2;
		float div = (float) Item1 / Item2;
		int modulus = Item1 % Item2;
		
		//Prompting
		System.out.println("total price: "+total_price);
		System.out.println("Price difference: "+price_diff);
		System.out.println("Price multiplication: : "+mult);
		System.out.println("Price division: "+div);
		System.out.println("Price remaining: "+modulus);
	}
}