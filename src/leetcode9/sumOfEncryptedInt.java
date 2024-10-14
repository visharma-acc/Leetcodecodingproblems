package leetcode9;

public class sumOfEncryptedInt {

	public static int encrpt(int n)
	{
		int max=0;
		int count=0;
		while(n>0)
		{
			int t=n%10;
			if(t>max)max=t;
		    count++;	
		    n=n/10;
		}
		int y=0;
		//System.out.println(count);
		//System.out.println(max);
		while(count>1)
		{
			
		   // y=max*10*(count-1);
			//System.out.println(10^(count-1));
			int x= (int) (max*(Math.pow(10,count-1)));
			y=y+x;
			//System.out.println(y);
		    count--;
		}
		y=y+max;
		return y;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {109};
		int sum=0;
		
		for(int item:nums)
		{
		  item=	encrpt(item);
		  sum=sum+item;  
		}
		
		int x=encrpt(nums[0]);
		System.out.println(sum);
		

	}

}
