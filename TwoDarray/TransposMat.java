package TwoDarray;
import java.util.Scanner;
public class TransposMat {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of rows");
    int row=sc.nextInt();
    System.out.println("Enter the value of cols");
    int cols=sc.nextInt();

    int at[][]=new int[row][cols];
    int bt[][]=new int [row][cols];

//input wala loop
    for (int i = 0; i < at.length; i++) {
        for (int j = 0; j < at[i].length; j++) {
            at[i][j]=sc.nextInt();
        }
    }
    

//transpose waala loop

    for (int i = 0; i < at.length; i++) {
        for (int j = 0; j < at[i].length; j++) {
            bt[i][j]=at[j][i];//transpose statement
             System.out.print(bt[i][j]+" ");//printing statement
        }
        System.out.println();

sc.close();    }
}



}
