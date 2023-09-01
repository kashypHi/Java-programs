
import java.util.Scanner;
public class Power
{
 public static int Po (int base , int exponent) {   
  int pow=1;
    for(int i = 1;i<= exponent ;i++)
          pow*= base;
          return pow;
    }
public static void main (String args[]) {
    Scanner sc=new Scanner(System.in);
int base,exponent;
System.out.println("Enter the base");
base=sc.nextInt();
System.out.println("Enter the exponent");
exponent=sc.nextInt();
int Power=(base*exponent);
System.out.println(base+"to pow " +exponent+"is" +Power);
sc.close();
}
}
