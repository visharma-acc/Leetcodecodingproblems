
public class findMaxAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 int []nums = {0,4,0,3,2};
	 int k = 1;
	 double avg=0, max=0,res=0;
	 for(int i=0; i<k;i++)
	 {
		 max=max+nums[i]; 
		 avg=max/k;
		 
	 }
	 System.out.println("initial max="+max);
	 
	 res=max;
	 
	 for(int i=k; i<nums.length;i++)
	 {
		 System.out.println(nums[i]+" "+nums[i-k]);
		 res=res+nums[i]-nums[i-k];
		 max=Math.max(max, res);
		 avg=(max/k);
		 System.out.println("current max="+max);
		 System.out.println("current avg="+avg);
	 }
		

	}

}
