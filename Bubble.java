public class Bubble {
//Qno-28 bublle sort in ascending order
//soting bubble: 1
//soting bubble: 3
//soting bubble: 4
//soting bubble: 6
//soting bubble: 9
    public static void main(String[] args) {
        int arr[]={6,9,4,3,1};
        for (int row = 0; row < arr.length-1; row++) {
            
                for (int j = 0; j < arr.length-1-row; j++) {
                   if(arr[j]>arr[j+1])
                   {

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                   } 
                
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("soting bubble: "+ arr[i]);
        }
        
    }
    
}
