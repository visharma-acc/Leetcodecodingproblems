package leetcode13;

public class hasTrailingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {1,2,3,4,5};
		int count=0;
		
		for (int i=0;i<nums.length;i++)
		{
			if((nums[i]&1)!=1) count++;
			if(count>=2) break;
		}
		

	}

}
