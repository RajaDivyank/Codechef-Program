import java.util.*;

class RAINFALL1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int x = sc.nextInt();
		    if(x<3){
		        System.out.println("LIGHT");
		    }
		    else if(x>=3 && x<7){
		        System.out.println("MODERATE");
		    }
		    else{
		        System.out.println("HEAVY");
		    }
		}
	}
}
