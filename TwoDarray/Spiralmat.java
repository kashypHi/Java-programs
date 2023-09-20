package TwoDarray;
public class Spiralmat {
    public static void main(String[] args) {
    int spr[][]={{1,2,3,4,5},{6,7,8,9,0},{5,4,3,2,1},{0,9,8,7,6}};
    int row_start=0;
    int row_end=spr.length-1;
    int col_start=0;
    int col_end=spr.length-1;

    while (row_start<=row_end&&col_start<=col_end)
    {
        for (int i=col_start ; i<=col_end; i++) {
            System.out.print(spr[row_start][i]+" ");
           
        }
        row_start++;
        for ( int i=row_start;i<=row_end;i++) {
            System.out.print(spr[i][col_end]+" ");
            
        }
        col_end++;
        for (int i= col_end; i >= col_start; i--) {
            System.out.print(spr[row_end][i]+" ");
            
        }
        row_end--;
        for (int i=row_end;i >= row_start;i--)
        {
            System.out.print(spr[i][col_start]+" ");
            col_start++;
            
        }
        System.out.print(spr);
    }
    System.out.println();
}
}
