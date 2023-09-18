package TwoDarray;
import java.util.Scanner;

//Q1 taking input from user and print the values

public class two_D_elemnt_1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows");
        int rows = sc.nextInt();
        System.out.println("enter the columns");
        int cols = sc.nextInt();
        String stu[][] = new String[rows][cols];

        for (int i = 0; i < stu.length; i++) {
            for (int j = 0; j < stu[i].length; j++) {
                System.out.print("Enter value in " + (i+1) + " row Array : ");
                stu[i][j] = sc.next();
            }
        }
        System.out.println("=========== Values u entered in array is ============");

        for (int i = 0; i < stu.length; i++) {
            for (int j = 0; j < stu[i].length; j++)
            {               
                    System.out.print(stu[i][j] + " ");
            }
            System.out.println();
    
        }

        sc.close();
    }

}