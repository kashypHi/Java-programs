import java.util.Scanner;
public class Prog1{
public static void main(String []ar)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the digit");
int n=sc.nextInt();
int prod=1;
while(n>0)
{
int rl=n%10;
prod= prod*rl;
n=n/10;
}
System.out.println("product is give digit="+prod);
sc.close();
}
}