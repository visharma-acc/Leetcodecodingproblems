package leetcode;

public class removeDuplicatesTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int []nums =  {1};
		
		int j=0;
	
		
		
		for(int i=0;i<nums.length;)
		{
			System.out.println("inside loop..");
			if(i+1<nums.length && nums[i]!=nums[i+1])
			{
				nums[j]=nums[i];
				j++;
				i++;
			}
			else
			{
				if(i+2<nums.length && nums[i]!=nums[i+2])
				{
					nums[j]=nums[i];
					nums[j+1]=nums[i];
					j++;
					i++;
				}
				else
				{
					i++;
				}
			}
			
			if(i==nums.length-1)
			{
				System.out.println("inside if..");
				if(nums[i-1]==nums[i])
				{
					System.out.println("inside if...  if...");
					System.out.println("j="+j);
					nums[j]=nums[i];
					j=j+1;
					nums[j]=nums[i];
					System.out.println("j="+j);
					//System.out.println(nums[j]+" "+nums[j+1]);
					j++;
				}
				else
				{	
				nums[j]=nums[i];
				j++;
				}
			}
			
			
		}
		
		
		System.out.println("j="+j);
		
		for(int i=0;i<j;i++)
		{
		   System.out.println(nums[i]);	
		}
		
	}

}
