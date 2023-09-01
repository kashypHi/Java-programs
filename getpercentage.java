import java.util.Scanner;

class getpercentage {
public static void main (String[]args) {
    int M;
    int N;
    int per=0,sum=0;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter first number");
    M=sc.nextInt();
    System.out.println("Enter second number");
    N=sc.nextInt();
    sum=M+N;
    System.out.println("sum");
    per = sum/500*100;
    
        System.out.println("per of mark"+per);
    sc.close();
}
}