package TwoDarray;
//Q14.create 2d aarray and find sum of all the elements in a column 
public class SumofCols {
    
    public static void main(String[] args) {
     int a[][]={{1,2,3},{4,5,6},{7,8,9}};
     //input wala value print hoga
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        //gap print hoga
System.out.println("------------");

//column ka sum print hoga
        for (int i = 0; i < a.length; i++) {
            int sum=0;
            for (int j = 0; j < a[0].length; j++) {
                sum+=a[j][i];

            }
            System.out.print(sum+" ");

            //system.out.println(sum); in user input
        }
    }
    
}
