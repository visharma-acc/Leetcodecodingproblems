package leetcode15;

public class uniquePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = 3, n = 7;
		int [][]dp =new int[m][n];
		
		for(int i=0;i<n;i++)
		{
			dp[0][i]=1;
		}
		for(int i=1;i<m;i++)
		{
			dp[i][0]=1;
		}
		
		for(int i=1;i<m;i++)
		{
			for(int j=1;j<n;j++)
			{
				dp[i][j]=dp[i][j-1]+dp[i-1][j];
			}
		}
		
		System.out.println(dp[m-1][n-1]);
	}

}
