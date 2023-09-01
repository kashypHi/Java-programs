import java.util.Scanner;
public class Asciivalue
{
public static void main(String[]ar){
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
do{
System.out.println(i);
i++;
}
while(i>=97 && i<=121);
System.out.println();
sc.close();
}
}


