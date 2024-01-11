package leetcode6;

public class moveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {0,1,0,3,12};
		int len=nums.length;
		int j=0;
		for(int i=0;i<len;i++)
		{
			if(nums[i]!=0)
			{
			  nums[j]=nums[i];	
			  j++;
			}
			
		}
		while(len>j)
		{nums[len-1]=0;
		  len--;
		}	
	    for(int i=0;i<nums.length;i++)
		 System.out.print(nums[i]+" ");
		
	}

}
