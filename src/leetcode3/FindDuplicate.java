package leetcode3;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {1,2,3,4,5,6,7,7,8};
		int sum=nums[0];
		int k=0;
		int n=nums.length;
		System.out.println(n);
		
		for(int i=1;i<=n-1;i++)
		{
          
			sum^=nums[i]^i;
		}
		
		System.out.println(sum);
		
	
		
	

	}

}
