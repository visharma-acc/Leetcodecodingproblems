package leetcode9;

public class maxProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
		
		int []nums = {1,5,4,6};
		int max=nums[0] , max2=nums[1];
		
		 if(max<max2)
         {
       	   max=max^max2;
       	   max2=max^max2;
       	   max=max^max2;
         }
			
		for(int i=2;i<=nums.length-1;i++)
		{
           if(nums[i]>max)
           {	
        	   int tmp=max;
        	   max=nums[i];
        	   max2=tmp;
           }   
           if(max>=nums[i] && nums[i]>max2)
           {
        	   max2=nums[i];
           }
			System.out.println("max "+max+" max2 "+ max2);
		}

		
		
	}

}
