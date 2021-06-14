public class Egg2 {
	public static void main(String[] args) {
		head();
		foot();
		body();
		head();
		foot();
		body();
		foot();
		head();
		body();
		foot();
	}
	public static void head() {
		System.out.println("  _______");
		System.out.println(" /       \\");
		System.out.println("/         \\");
	}
	public static void body() {
		System.out.println("-\"-\'-\"-\'-\"-");
	}
	public static void foot() {
		System.out.println("\\         /");
		System.out.println(" \\_______/");
	}
}
