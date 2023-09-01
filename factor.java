import java.util.Scanner;
class factor
{
public static void main (String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
boolean flag=true;
for(int i=2;i<=n/2;i++){
if(n%i==0)
{
System.out.println("Is not a prime no");
flag=false;
break;

}
}

if(flag)
{
System.out.println("prime no");
sc.close();
}
}
}