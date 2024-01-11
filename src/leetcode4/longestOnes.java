package leetcode4;

public class longestOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, k = 3;
		int index[]=new int[k];
		
		int len=nums.length;
		
		int i=0;
		int t=0;
		int sublen=0;
		int start=0;
		while(i<len)
		{
			if(nums[i]==0)
			{ 
				nums[i]=1;
				index[t++]=i;
				i++;
			}
			else
			{
				i++;
			}
			if(t==k) {
				sublen=i-start;
				
			}
		}

	}

}
