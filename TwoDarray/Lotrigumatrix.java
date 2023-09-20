package TwoDarray;
//Q12 print lower trugular matrix
import java.util.Scanner;
public class Lotrigumatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row");
        int row=sc.nextInt();
        System.out.println("Enter the value of cols");
        int cols=sc.nextInt();

        int ar[][] = new int [row][cols]; 
        //System.out.println("Enter the  data");
//input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <cols; j++) {
                System.out.println(" Enter the "+i+" th row and "+j+" th column element");
            ar[i][j]=sc.nextInt();
            }
        }

        //output
        System.out.println("==================");
        for (int i = 0; i <row; i++) {
            for (int j = 0; j <cols; j++) {
                //in upper triangular matrix we can only change  if(i<=j) {
                if(i>=j){
                    System.out.print(ar[i][j]+" ");
                }
                else
                {
                    System.out.print(0+" ");
                }
               
            }
             System.out.println();
            
        }
    sc.close();
    }
}
