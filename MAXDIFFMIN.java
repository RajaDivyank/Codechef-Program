import java.util.*;

class MAXDIFFMIN{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int diff=0;
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    if(a>b){
		        if(a>c){
		            diff = a-b;
		        }else{
		            diff = c-b;
		        }
		    }else{
		        if(b>c){
		            diff = b-a;
		        }else{
		            diff = c-a;
		        }
		    }
		    System.out.println(diff);
		}
	}
}