public class Array2 {
public static void main (String args []) {
String stu[][]=new String[3][3];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the rows");
int rows=sc.nextInt();
System.out.println("enter the columns");
int cols=sc.nextint();
String stu[][]=new String[rows][3];

for(int i=0;i<stu.length;i++)
 {
for(intj=0;j<stu.length;j++)
{
stu[i][j]=next();
}
}
System.out.println("enter data");
for(int i=0;i<stu.length;i++);
{
for (int j=0;j<stu.length;j++)
{
System.out.print(stu[i][j]+" ");
}}
System.out.println();

}
}

