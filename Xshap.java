public class Xshap {
public static void main(String ar[]) {
int n=5;int sp=1;int space=(2*n)-2;
for(int i=1;i<2*n;i++)
{
    for(int j=1;j<sp;j++){
    System.out.print("* ");
    }

    for(int k=space;k>1;k--){
     System.out.print(" ");
    }

    for(int l = 1 ; l <=sp; l++)  {
      if(l!=n)
      System.out.print("*");
    }
         System.out.println();
  
if(i<n){
sp++;
space-=2;
}else{
sp--;
space+=2;
}
}
}
}