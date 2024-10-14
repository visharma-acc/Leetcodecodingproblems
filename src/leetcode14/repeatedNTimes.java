package leetcode14;

public class repeatedNTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {2,1,2,5,3,2};
	    int i,j;
		int flag=0;
	    
		for( i=0;i<nums.length;i++)
		{
			for(j=i+1;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					System.out.println("check equal..");
					System.out.println("i="+i+" j="+j);
					System.out.println(nums[i]);	
					flag=1;
					break;
				}
				
				if(nums[i]>nums[j])
				{
					nums[i]=nums[i]^nums[j];
					nums[j]=nums[i]^nums[j];
					nums[i]=nums[i]^nums[j];
				}
				
			}	
		//System.out.println(nums[i]);	
			if(flag==1)break;
		}
		
	}

}
