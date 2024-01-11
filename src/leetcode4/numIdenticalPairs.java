package leetcode4;

public class numIdenticalPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// leet code question 
		//https://leetcode.com/problems/number-of-good-pairs/

		int c=0;
		int nums[] = {1,2,3,1,1,3};	
		
		for (int i=0;i<nums.length-1;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
					c++;
					
			}
		}
		System.out.println(c);
		
	}

}
