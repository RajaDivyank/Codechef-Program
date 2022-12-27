import java.util.*;

class LTIME{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int x = sc.nextInt();
		    if(x>=1 && x<=4){
		        System.out.println("YES");
		    }
		    else{
                System.out.println("NO");
		    }
		}
	}
}