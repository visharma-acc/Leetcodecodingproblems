package leetcode15;

public class islandPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		
		int calsum[][]=new int [4][4];
		
		for(int i=0;i<4;i++)
		{
		  
		}
	
		
		for(int i=1;i<4-1;i++)
		{
			for(int j=1;j<4-1;j++)
			{
				if(grid[i][j]==0) calsum[i][j]=0;
				else
				{		
					calsum[i][j]=grid[i-1][j]+grid[i+1][j]+grid[i][j-1]+grid[i][j-1];
				}
				
			}
		}
	}

}
