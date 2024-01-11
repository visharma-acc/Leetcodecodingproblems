package leetcode2;

public class Maxconsecutive {

	public static void main(String args[])
	{
	
	int []nums = {0,0,0,0,0,1,1,1,1,0,1,1,1,1,1,1};
	int x=1;
	int y=x^1;
	int max=0,c=0;
	
	System.out.println(y);
	
	for(int i=0;i<nums.length;i++)
	{
      
		if((nums[i]^1)==0)
		{
		  	c++;
		}
		else
		{
			max=Math.max(max, c);
			c=0;
		}
		
	}
	
	max=Math.max(max, c);
	
	
	System.out.println(max);
	
	}
	
}
