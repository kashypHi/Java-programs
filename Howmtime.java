public class Howmtime {
    //Q12 How many times an element
    public static void main(String[] args) {
        int arr[]={10,20,30,40,10,60,20,90,10};
        int target=10;
        int count=0;
        for (int i=0;i<arr.length;i++)
         {
            if (arr[i]==target)
            count++;
       }
       System.out.println("No of times occurance : " +count); 
    }
}
