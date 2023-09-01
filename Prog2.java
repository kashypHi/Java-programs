import java.util.Scanner;
public class Prog2{
public static void main(String []ar)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the digit");
int n=sc.nextInt();
int sum=0;
int count=0;
while(n>0)
{
int mi=n%10;
sum= sum+mi;
count++;
n=n/10;
}
int avg=sum/count;
System.out.println("Average of given digit="+avg);
sc.close();
}
}