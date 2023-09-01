import java.util.Scanner;

public class Array_compare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int arr1[] = new int[5];

        for (int i = 0; i < arr.length; i++) {            
            System.out.print("ENTER VALUE FOR ARRAY 1 : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("==============="); 

        for (int i = 0; i < arr1.length; i++) {
            
            System.out.print("ENTER VALUE FOR ARRAY 2 : ");
            arr1[i] = sc.nextInt();
        }


        for (int i = 0; i < arr.length; i++) {
  
             for (int j = 0; j < arr1.length; j++)
             {
                 if(arr[i] == arr1[j]){
                    System.out.println("similar elements are : " + arr[i]);
                 }

             }
       }   
       System.out.println("======================");
       
       sc.close();
    }
}
