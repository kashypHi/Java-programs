import java.util.Scanner;

public class Pow {
    public static int power(int base, int exponent) {
        int pow = 1;
        for (int i = 1; i <= exponent; i++)
            pow *= base;
        return pow;
    }

    public static void main(String args[]) {
        int base = 0, exponent = 0, pow = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Bas");
        base = sc.nextInt();
        System.out.println("Enter the Expo");
        exponent = sc.nextInt();
        int power = (base * exponent);
        System.out.println("base" + pow + "exponent is" + power);
        
        sc.close();
    }
}
