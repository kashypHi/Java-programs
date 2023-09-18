public class Targetsum {
    public static void main(String[] args) {
        int arr[]={2,7,3,4,6,8,9,11,0};
        int target=10;
        for (int i = 0; i < arr.length; i++)
         {
          for(int j=i+1; j < arr.length; j++)
          {
          if (arr[i]+arr[j]==target)
            {
                System.out.println(i +" ," +j);
            }
          }  
        }
    }
    
}
