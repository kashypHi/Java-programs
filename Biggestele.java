public class Biggestele {
    public static void main(String[] args) {
        int a[]={4,5,8,15,50,42,94,87,};
        int max=a[0];
        int min=a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max) {
                max=a[i];
            }
            if (a[i]<min){
                min=a[i];
            }
        }
        System.out.println("the max value is:"+max);
        System.out.println("the min value is:"+min);
    }
    
}
