package leetcode15;

import java.util.Arrays;

public class numbersquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=12;
		int dp[]=new int [n+1];	
		Arrays.fill(dp,Integer.MAX_VALUE);
		dp[0]=0;
		dp[1]=1;
		
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j*j<=i;j++)
			{
				dp[i]=Math.min(dp[i], dp[i-(j*j)]+1);
				System.out.println("dp["+i+"]="+dp[i]);
			}
		}
		
	}

}
