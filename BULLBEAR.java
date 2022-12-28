import java.util.*;

class BULLBEAR{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int cp = sc.nextInt();
		    int sp = sc.nextInt();
		    if(cp>sp){
		        System.out.println("LOSS");
		    }else if(cp==sp){
		        System.out.println("NEUTRAL");
		    }else{
		        System.out.println("PROFIT");
		    }
		}
	}
}
