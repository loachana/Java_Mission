public class ExamQ3 {
	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		do {
			System.out.println(x);
			x++;
		} while(x>3);
		
		while (y > 3) {
			System.out.println("while");
			y++;
		}
		System.out.println("x: "+x+"\ny: "+y);
	}
}