public class Application {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.addition(1, 2));  // should be 3
		System.out.println(c.addition(1.5, 3.2)); // should be 4.7
	}
}
