package leetcode;





public class climbStairs {
	
	public static int climb(int n)
	{
		if(n==1)
			return 1;
		else if(n==2)
			return 1;
		else
			return n-1+climb(n-1);
			
		
		
		//return -1;
	}
	
	public static void main(String args[])
	{
		
	}

}
