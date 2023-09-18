
class Pat6 {
public static void main (String aar[]) {
int n=4;
	for(int row=0;row<2*n;row++) {

 int l=row<n ? 2*n-row: row;


    for(int col=1;col < l;col++){
	System.out.print("*" +" ");
}
System.out.println();
}
}
}