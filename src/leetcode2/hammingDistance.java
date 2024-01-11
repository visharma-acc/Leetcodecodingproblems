package leetcode2;

import java.util.ArrayList;

public class hammingDistance {
	
	public static ArrayList<Integer> getbits(int x)
	{
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		while(x>0)
		{
			int r=x%2;
			ar.add(0,r);
			x=x/2;
		
		}
		
		
		
		return ar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=1;
		int y=4;
		
		ArrayList<Integer> ar=getbits(x);
		ArrayList<Integer> ar1=getbits(y);
		
		
		System.out.println(ar);
		System.out.println(ar1);
		
		int n=ar.size();
		int m=ar1.size();
		int max=Math.max(n,m);
		System.out.println("n="+n+" m="+m+" max="+max);
		if(n<max)
		{
			int t=0;
			while(t<(max-n))
			{	
				ar.add(0, 0);t++;
			}	
		}
		else
		{
			int t=0;
			while(t<(max-m))
			{	
				ar1.add(0, 0);t++;
			}	
			
		}
		
		int k=0;
		int c=0;
		
	    while(k<max)
	    {
	    	if((ar.get(k)^ar1.get(k))==1)
	    	{
	    		c++;
	    	}
	    	k++;
	    }
		
		
		System.out.println(ar);
		System.out.println(ar1);
		System.out.println(c);
		
	}

}
