package leetcode;

public class printPermutations {

	public static void printArray(int nums[])
	{
		for(int i=0; i<nums.length;i++)
			System.out.print(i);
		
	}
	
	public static void swap(int nums[], int i ,int j)
	{
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
	
	public static void printPermute(int nums[], int cid)
	{
	  if(cid==nums.length-1)
	  {
		  printArray(nums);
	  }
	  
	  for(int i=0;i<nums.length;i++)
		{
			swap(nums, i,cid);
			printPermute(nums,i);
			swap(nums, cid,i);
		}
		
	}
	
	public static void main(String args[])
	{
		int nums[]= {1,2,3};
		
		printPermute(nums,0);
		
		
		
	}
	
}
