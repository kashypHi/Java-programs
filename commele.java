import java.util.Scanner;
public class commele {
    //commaon elements between two array
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    int b[]=new int [5];

    for (int i = 0; i < a.length; i++) {
        System.out.println("Enter Element of first array"+i);
         a[i]=sc.nextInt();
        
    
    for(int j=0;j<b.length;j++) {
        System.out.println("Enter Element of second array:"+j);
         b[j]=sc.nextInt();
    
    if (a[i]==b[j]) {
        System.out.println("common element are:"+a[i]);
        break;
    }
    
sc.close();
}
}
}   
}
