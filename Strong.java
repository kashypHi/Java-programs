import java.util.Scanner;
public class Strong {
public static void main (String[]ar) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int number=sc.nextInt();
int sum=0;
int temp=0;
while(temp>0){
int fact=1;
for(int i=1;i<=sum;i++){

  fact=fact*i;}

    sum=sum+fact;
 temp=temp/10;
}
if(number==sum){
System.out.println("Strong number");
} else
System.out.println("not a strong number");
sc.close();
}
}