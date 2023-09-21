import java.util.Scanner;
public class linearSearch {
    public static void main(String [] args) {
        int n ;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number the elements");
n=sc.nextInt();
int val[]=new int[n];
for (int i = 0; i < n; i++) {
    val[n]=sc.nextInt();
    System.out.println("Enter thee value to find");
    int search=sc.nextInt();
    for ( i = 0; i < n; i++) {
        if(val[n]==search){
            System.out.println("Is present at elementss"+(i+1)+" "+search);
    
        }
        else{
            System.out.println("Is not prsent in array"+search);
        }
    }
    sc.close();
}
}
}
