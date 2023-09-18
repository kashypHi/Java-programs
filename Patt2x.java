import java.util.Scanner;
class Patt2x {

public  static void main (String ar[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the num:");
int n = sc.nextInt();
int sp=n,st=1;
 for(int i=1; i<=2*n-1;i++){
  for(int j=1;j<=sp;j++) {
        System.out.print(" ");}
  for(int k=1;k<=st;k++){
        System.out.print(k);
}
   if(i<n){
  sp--;st++;
   }else{
  sp++;st--;
}
   System.out.println();
}
sc.close();
}
}