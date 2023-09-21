package TwoDarray;
//Q10 WAP to check if two arrays are identical or not by value
public class Identicalornot {
    public static void main(String[] args) {
        int ai[][]={{1,0,0},{0,1,0},{0,0,1}};
        if (ai.length==ai[0].length);

        boolean flag=false;

        for (int i = 0; i < ai.length; i++) {
            for (int j = 0; j < ai[i].length; j++) {
                if((i==j ) && ( ai[i][j]!=1)) {
                        flag=true;
                        break;
                }
                if(i!=j && ai[i][j]!=0) {
                    flag=true;
                    break;
                }
            }    
        }
        if(flag==true)
        {
            System.out.println("NOT IDENTITY");
        }
        else
        {
            System.out.println("IDENTITY MATRIX");
        } 
    }
    }
