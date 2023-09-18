public class HigsumAr {
    //to find max value
    public static void main(String[] args) {
        int ar[]={2,7,9,3,4,11,12,0};
        int sum=0;
        for (int i = 0; i < ar.length; i++)
         {
           for (int j = i+0; j < ar.length; j++) {
            if(ar[i]+ar[j]>sum)
            sum=ar[i]+ar[j];
            
           } 
        }
        System.out.println(sum);
       }
    
}
