package leetocode8;

public class minCostClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://leetcode.com/problems/min-cost-climbing-stairs/?envType=study-plan-v2&envId=leetcode-75
		
		int []cost = {1,100,1,1,1,100,1,1,100,1};
		
		int n=cost.length+1;
		int []dp=new int[n];
		dp[n-1]=0;
		//System.out.println(dp.length);
		for(int i=n-2;i>=0;i--) {
			if(i+2>=n)
				dp[i]=cost[i]+ Math.min( dp[i+1],0);
			else
				dp[i]=cost[i]+ Math.min( dp[i+1],dp[i+2]);
		 //System.out.println(dp[i]);	
		}
		
		System.out.println(Math.min( dp[0],dp[1]));
		
	

	}

}
