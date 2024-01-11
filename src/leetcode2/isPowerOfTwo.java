package leetcode2;

public class isPowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=-16;
		long x=1;
		
		if(n<0)
			x=-1;
		
	if(n>0)
	{	
		while(x<n)
		{
			if(Integer.MAX_VALUE>(x*2))
			x=x*2;
			else
				break;
			System.out.println(x);
		}
	}

		
		if(x>Integer.MIN_VALUE && x<Integer.MAX_VALUE)
		{
			if(x==n)
				System.out.println(true);
			else
				System.out.println(false);
		}
		
		System.out.println(x);

	}

}
