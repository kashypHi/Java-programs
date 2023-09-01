public class Xshap {
public static void main(String ar[]) {
int n=5;int s=0;int star=2*n;
for(int i=1;i<=2*n;i++)
{
for(int j=1;j<=s;j++)
  System.out.print("");

for(int k=1;k<=star;k++)
  System.out.print("*");

if(i>5){
s++;star-=2;
}
else{
s--;star+=2;
}
System.out.println();
}
}
     }