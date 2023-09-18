public class Distinelem {
    //17.distinct element of two array
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6};
        int br[]={4,5,6,7,8,9};
        boolean flag=false;
        int i;
        for (i = 0; i < ar.length; i++) {        
        for (int j = 0; j < br.length; j++) {
            if(ar[i] == br[j]) {
                flag=true;
               break;
            }
         
        }
         if(flag==false) {
                System.out.println("distinct element"+ar[i]);
            }
        }
          for (i = 0; i < br.length; i++) {        
        for (int j = 0; j < ar.length; j++) {
            if(br[i] == ar[j]) {
                flag=true;
               break;
            }
         
        }
         if(flag==false) {
                System.out.println("distinct element"+br[i]);
            }
        }

       
           
    }
}
