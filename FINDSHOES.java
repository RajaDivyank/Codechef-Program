import java.util.*;

class FINDSHOES{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int temp = 0;
		    int friends = sc.nextInt();
		    int left = sc.nextInt();
		    if(friends<left){
                temp = left-friends; 
		    }else{
		        temp = (friends-left) + friends;
		    }
		    System.out.println(temp);
		}
	}
}