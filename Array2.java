import java.util.Scanner;
public class Array2 {
    
    public static void main (String args []) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows=sc.nextInt();
        System.out.println("enter the columns");
        int cols=sc.nextInt();
        int stu[][]=new int [rows][cols];

for(int i=0;i<stu.length;i++)
 {
for(int j=0;j<stu.length;j++)
{
stu[i][j]=sc.nextInt();
}
}
System.out.println("enter data");
for(int i=0;i<stu.length;i++);
{
for (int j=0;j<stu.length;j++)
{
System.out.print(stu[rows][cols]+" ");
}}
System.out.println();
sc.close();
}
}

