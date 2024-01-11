package leetcode4;

public class reducetoZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
		
	//https://www.geeksforgeeks.org/check-if-a-number-is-odd-or-even-using-bitwise-operators/
		
		int n=14;
		int c=0;
		while(n!=0)
		{
			if((n^1)==n+1)
			{	
				n=n>>1;
				c++;
				System.out.println(n);
			}	
			else		
			{
				n=n-1;	
			    c++;
			    System.out.println(n);
			}	
		}
		
	System.out.println(c);
		
	}

}
