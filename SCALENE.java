import java.util.*;

class SCALENE{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    if(a!=b && a!=c && b!=c){
		       System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}