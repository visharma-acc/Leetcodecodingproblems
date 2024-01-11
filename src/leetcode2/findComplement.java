package leetcode2;

public class findComplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5;
		
		int nums[]= {1,2,3,4,5,3};
		
		  int len = nums.length;
	        int[] cnt = new int[len + 1];
	        for (int i = 0; i < len; i++) {
	            cnt[nums[i]]++;
	            if (cnt[nums[i]] > 1) {
	                //return nums[i];
	            }
	        }
	        
	        for (int i=0;i<cnt.length;i++)
	        {
	        	System.out.print(cnt[i]+"\t");
	        }
	        
	        for (int num : nums) {
	            int idx = Math.abs(num);
	            if (nums[idx] < 0) {
	               // return idx;
	            }
	            nums[idx] = -nums[idx];
	        }
	        
	        System.out.println();
	        
	        for (int i=0;i<nums.length;i++)
	        {
	        	System.out.print(nums[i]+"\t");
	        }

	}

}
