import java.util.*;

class M1ENROL{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if(x>=y){
		        System.out.println("0");
		    }else{
		        System.out.println(y-x);
		    }
		}
	}
}