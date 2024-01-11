import java.util.Arrays;

public class minimumDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []nums = {9,4,1,7};
		int k = 2;
		
		//9,7,4,1;
		
		Arrays.sort(nums);
		
		int min=100000;
		int l=0;
		
		for(int j=nums.length-1;j>=0;j--)
		{
			if(j-k+1>=0)
			{	
		    l=nums[j]-nums[j-k+1];
		    System.out.println("l="+l);
		    min=Math.min(l, min);
			}
			//System.out.println(nums[j]);
		}
		

		System.out.println("min="+min);

	}

}
