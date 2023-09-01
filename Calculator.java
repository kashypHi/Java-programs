import java.util.Scanner;

class calculator {
	public static void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public static void sub(double a, double b) {
		double c = a + b;
		System.out.println(c);
	}

	public static void product(long a, long b) {
		long c = a + b;
		System.out.println("product is" + "= " + c);
	}

	public static void div(float a, float b) {
		float c = a + b;
		System.out.println("div is " + "=" + c);
	}

	public static void sum(char a, char b) {
		int c = a + b;
		System.out.println("char is " + "=" + c);
	}

	public static void main(String[] args) {
		System.out.println("Enter two data");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		char c = sc.next().charAt(0);
		char d = sc.next().charAt(0);
		add(a, b);
		sub(a, b);
		product(a, b);
		div(a, b);
		sum(c, d);

		sc.close();
	}
}