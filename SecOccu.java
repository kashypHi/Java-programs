public class SecOccu {
    public static void main(String[] args) {
        int a[]={10,20,30,40,60,20,90,100};
        int target=20,count=0;

        for (int i=0;i<a.length;i++) {
            if(a[i]==target)
            count++;
            if (count==2)
            {
                System.out.println("second occurance element in array:" + i);
            }
        }
    }
}
