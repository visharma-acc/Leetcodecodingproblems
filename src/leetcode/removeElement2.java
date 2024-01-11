package leetcode;

public class removeElement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {0,1,2,2,3,0,4,2};
		int val = 2;
		int j=0;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=val)
			{
				System.out.println("j="+j +""+"i="+i);
				System.out.println(nums[j] +" "+nums[i]);
				nums[j]=nums[i];
				j++;
			}
		}
		
		for(int i=0;i<j;i++)
		{
			System.out.println(nums[i]);
		}

	}

}
