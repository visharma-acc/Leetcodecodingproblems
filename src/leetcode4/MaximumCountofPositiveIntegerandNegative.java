package leetcode4;

public class MaximumCountofPositiveIntegerandNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []nums = {5,20,66,1314};
		int l=nums.length;
		int pos=0;
		int neg=0;
		
		System.out.println(l);
		
		for(int i=0,j=l-1; i<=j;)
		{
			
			if(nums[i]<0)
			{	
				neg++;
				i++;
				if(i==l)break;
			}	
			if(nums[j]>0)
			{
				pos++;
				j--;
				if(j==-1)break;
			}
			if(nums[j]==0)
				j--;
			
		}
		
		System.out.println(neg+" "+pos);
	
	

	}

}
