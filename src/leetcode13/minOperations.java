package leetcode13;

public class minOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,5,2,4,1};
		
		int n=nums.length;
		int opr=0;
		for(int i=1;i<n;i++)
		{
		   if(nums[i-1]>=nums[i])
		   {
			opr+=nums[i-1]-nums[i]+1; 
			nums[i]=nums[i-1]+1;
			System.out.println("opr"+opr+" "+nums[i]);
		   }	   
		}
	}

}
