package leetcode11;

public class shuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {1,2,3,4,4,3,2,1} ;
		int  n = 4;
		int []result=new int [nums.length];
		int j=0;
		for(int i=0;i<n;i++)
		{
			result[j]=nums[i];
			result[j+1]=nums[i+n];
			System.out.print(result[j]+" "+result[j+1]+" ");
			j=j+2;
		}

        		
	}

}
