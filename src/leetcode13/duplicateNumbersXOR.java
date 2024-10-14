package leetcode13;

public class duplicateNumbersXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {1,2,3};
		int freq[]=new int[51];
		int xor=0;
		
		int n=nums.length;
		for(int i=0;i<n;i++)
		{
		   
		   int index=nums[i]-1;
		   freq[index]=freq[index]+1;
		   if(freq[index]==2)
		   {
			   xor=xor^nums[i];
		   }
			
		}
		
		System.out.println(xor);
	}

}
