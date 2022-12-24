import java.util.*;

class KITCHENSPICE{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int x = sc.nextInt();
		    if(x<4){
		        System.out.println("MILD");
		    }else if(x>=4 && x<7){
		        System.out.println("MEDIUM");
		    }else{
		        System.out.println("HOT");
		    }
		}
	}
}