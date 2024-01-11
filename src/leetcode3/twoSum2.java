package leetcode3;

public abstract class twoSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  numbers[] = {2,3,4};
		int target = 6;
		
		int i=0,j=numbers.length-1;
		int num[]= new int[2];
		
		while(i<j)
		{ 
			if(numbers[i]+numbers[j]==target)
			{
				num[0]=i+1;
				num[1]=j+1;
				break;
			}
			else if(numbers[i]+numbers[j]>target)
			{
				j--;
			}
			else
			{
				i++;
			}
		  	
		}
		
		System.out.println(num[0]+" "+num[1]);
		
	}

}
