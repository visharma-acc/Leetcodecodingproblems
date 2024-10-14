package leetcode15;

public class removeduplicatesInplace {

	public static void main(String[] args) {
	
		 int []nums = {0,2,3,4};
		 
		 int k=0;
		
		 int freq=0;
		 
		 for(int i=1;i<nums.length;i++)
		 {
			 if(nums[i-1]==nums[i])
			 {
				 System.out.println(nums[i-1]+" "+nums[i]);
				 if(freq<1)
				 {	 
				 k=k+1;
				 }
				 System.out.println(k);
				 freq=freq+1;
				 System.out.println("freq="+freq+" for"+nums[i]);
								 
			 }
			 else
			 {
				 System.out.println("****************");
				 System.out.println("different no..reset");
				 k=k+1;
				 freq=0;
				 System.out.println("no mot matched is"+nums[i]);
				 System.out.println("k is "+k+" i is "+i);
				 System.out.println("*********************");
				
			 }
			 if(i!=k)
			 {
				 nums[k]=nums[i];
			 }
			 
		 }
	
		 System.out.println(k);
		 
		 
		 for(int i=0;i<=k;i++)
		 {
			 System.out.print(nums[i]+" ");
		 }
	
	}
}
