package TwoDarray;
import java.util.Scanner;
public class Two_d_ele_3 {
    public static void main(String[] args) {
        
    //scanner class ke liye
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Rows");
    int rows = sc.nextInt();
    System.out.println("Enter the columns");
    int cols=sc.nextInt();
    int student[][]=new int[rows][cols];
//input bala
    for (int i = 0; i < student.length; i++) {
        for (int j = 0; j < student.length; j++) {
            System.out.println("Enter the value :");
            student[i][j] = sc.nextInt();
        }   
        
    }//output bala
    for (int i = 0; i < student.length; i++) {
        for (int j = 0; j < student.length; j++) {
            System.out.print(student[i][j]+" ");
        }
        System.out.println();
    }//cols product print karne ke liye
    for (int i = 0; i < student.length; i++) {
        for (int j = 0; j < student.length; j++) {
            int product=0;
                product = product*student[i][j];
            }
        }
        sc.close();
                System.out.print("product of elements in row");
    }
    }
   

