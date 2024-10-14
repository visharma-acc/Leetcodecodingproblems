package leetcode15;

public class uniquePathsWithObstacles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]obstacleGrid = {{0,1},{0,0}};
		int m=obstacleGrid.length;
		int n=obstacleGrid[0].length;
		
		System.out.println(m+" "+n);
		
		int [][]dp =new int[m][n];
		
	//	if(obstacleGrid[0][0]==1) return -1;
		
		if(obstacleGrid[0][0]==0)
			dp[0][0]=1;
		else
			dp[0][0]=-1;
		
		for(int i=1;i<m;i++)
		{
			if(obstacleGrid[i][0]==0)
			{	
				if(dp[i-1][0]==-1)
			     dp[i][0]=-1;
				else
				 dp[i][0]=1;	
			}   
			else
				dp[i][0]=-1;
		}
		for(int i=1;i<n;i++)
		{
			if(obstacleGrid[0][i]==0)
			{
				if(dp[0][i-1]==-1)
					dp[0][i]=-1;
				else
					dp[0][i]=1;
			}    
			else
				dp[0][i]=-1;
		}
		
		for(int i=1;i<m;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(obstacleGrid[i][j]==1) dp[i][j]=-1;
				else
				{
					if(dp[i-1][j]==-1)
						dp[i][j]=dp[i][j-1];
					else if(dp[i][j-1]==-1)
						dp[i][j]=dp[i-1][j];
					else
					dp[i][j]=dp[i][j-1]+dp[i-1][j];
				}
				
			}
		}
		
		
		if(dp[m-1][n-1]==-1)
			System.out.println(0);
		else
		   System.out.println(dp[m-1][n-1]);
		
		System.out.println("---------------------");
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
	}

}
