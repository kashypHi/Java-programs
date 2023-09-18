import java.util.Scanner;
public class Crearray {
public static void main (String ar[]) {
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of  you want  too store ");
n=sc.nextInt();
String []arr=new String[5];
System.out.println("Enter the Array");
for (int i=0;i<n;i++) 
arr[i]=sc.nextLine();
		     
System.out.println("Array name are");
for(int i=0;i<n;i++) {
System.out.println(arr[i]);
}
	}
			}
