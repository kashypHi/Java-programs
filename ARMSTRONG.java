public class ARMSTRONG {
	public static void main (String ar[]) {
	int x=160;
	int temp=x;
	int c=count(x);
	int sum=0;
	while (x>0) {
		int r=x %10;
		sum +=pow(r,c);
		x/=10;
	}
	if (temp==sum)
		System.out.println("armstrong");
	}


public  static int count(int num) {
	int count=0;
	while (num>0) {
	num/=10;
	count++;
	}
	return count;
}
    public static int pow(int n,int p) {
	int pro=1;
	for(int i=1;i<=p;i++) {
		pro*=n;
	}
		return pro;
	
}
}