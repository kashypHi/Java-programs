import java.util.Scanner;
public class checkgreater5 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value which is divisible by");
      int n=sc.nextInt();
      
          if((n%5==0)&&(n%7==0)){
            System.out.println("given no :"+n+"is divisible by 5 and 7");
        } else{
            System.out.println("given number"+n+"is not divisible by 5and 7");
    }
    sc.close();
    }
}
