package TwoDarray;
import java.util.Scanner;

//Q2. Create a 2d array and find sum of all the elements in a row.

public class two_D_elemnt_2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows");
        int rows = sc.nextInt();
        System.out.println("enter the columns");
        int cols = sc.nextInt();
        int stu[][] = new int[rows][cols];

        for (int i = 0; i < stu.length; i++) {
            for (int j = 0; j < stu[i].length; j++) {
                System.out.print("Enter value in " + (i+1) + " row Array : ");
                stu[i][j] = sc.nextInt();
            }
        }

        System.out.println("============== matrix ============");            
            for (int i = 0; i < stu.length; i++) { //print matrix 1

                for (int j = 0; j < stu[i].length; j++) {               
                    System.out.print(stu[i][j] + "  ");
                }
                System.out.println();
            }   

        System.out.println("=========== Sum of row in matrix is ============");

        for (int i = 0; i < stu.length; i++) {

            int sum = 0;

            for (int j = 0; j < stu[i].length; j++)
            {               
                sum = sum + stu[i][j];
            }
            System.out.println();
            System.out.print("Sum of elements in row "+ (i+1) + " is : "+sum);
    
        }

        sc.close();
    }

}