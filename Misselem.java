//Qno-13 missing element in sorted array 
public class Misselem {
    public static void main(String[] args) {
       int j=0;
        int ai[]={3,5,9,12,16,19};
        for (int i = 0; i <=20; i++) {
            if(j< ai.length && ai[j] == i)
            j++;
            else
            System.out.println(i);
        }
}
}

