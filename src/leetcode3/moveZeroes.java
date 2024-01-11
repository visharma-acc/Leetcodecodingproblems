package leetcode3;

public class moveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {0,1,0,3,12};
		int c=0;
		int k=0;
		int l=nums.length;
		
		for(int i=0;i<l;i++)
		{
			if(nums[i]==0)
				c++;	
			else
			{
			  nums[k]=nums[i];
			  k++;
			}
		}
		
		while(c>0)
		{
		  nums[k]=0;
		  k++;
		  c--;
		}
		
		
	

	}

}
