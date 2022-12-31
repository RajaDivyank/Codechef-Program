import java.util.*;

class INVESTMENT{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if(x>=(y*2)){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
	}
}
