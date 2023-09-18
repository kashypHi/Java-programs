import java.util.Scanner;

class Patt1cone {
public  static void main (String ar[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the num:");
int n=sc.nextInt();
int k=n,s=1;
for(int i=1;i<2*n;i++)
{
for(int j=1;j<=k;j++){
System.out.print(" ");
}
for(int h=1;h<=s;h++){
    System.out.print("*");
}
System.out.println();


if(i<n){
k++;
}else{
k--;
}
sc.close();
}
}
}
