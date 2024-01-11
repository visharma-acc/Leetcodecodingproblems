package leetcode;

public class searchRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {1};
		int  target = 1;
		int res[]= {-1,-1};
		int first=0;
		int last=nums.length-1;
		
		while(first<=last)
		{
			if(nums[first]!=target && res[0]==-1)
				first++;
			else
			  res[0]=first;
			
			if(nums[last]!=target && res[1]==-1)
				last--;
			else
				res[1]=last;
			
			System.out.println("first is "+first);
			System.out.println("last is "+last);
			
			if(res[0]!=-1 && res[1]!=-1)
			{	
				System.out.println("inside break..");
				break;
			}	
				
			
		}
		
	
		
		System.out.println(res[0]+" "+res[1]);
			
		
	}

}
