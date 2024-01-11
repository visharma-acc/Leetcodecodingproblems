package leetcode7;

public class findMaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {1,0,1,1,0,1};
		int t=0, max=0;
		
		for(int i=0;i<nums.length;i++)
		{
		  if((nums[i]&1)==1)
		  {
			  t++;
		  }
		  else
		  {
			  if(max<t)max=t;
			  t=0;
		  }  
		}
		
		if(max<t)max=t;
		
		System.out.println(max);
		
	}

}
