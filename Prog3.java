import java.util.Scanner;
public class Prog3
{
public static void main(String[]ar)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any digit");
int n= sc.nextInt();
int sum=0;
while(n>0)
{
int rl=n%10;
if(rl%2==0)
{
sum=sum+rl;}
n=n/10;
}
System.out.println("sum of even no="+sum);
sc.close();
}
}
