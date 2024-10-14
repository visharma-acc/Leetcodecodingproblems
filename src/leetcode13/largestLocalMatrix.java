package leetcode13;

public class largestLocalMatrix {
	
	public static int findmax(int grid[][] , int i , int j) {
		
		int max=0;
		//System.out.println(i+" "+j);
		int m=i, n=j;
		for(i=m;i<m+3;i++)
		{
			for(j=n;j<n+3;j++)
			{
				if(grid[i][j]>max)max=grid[i][j];
			}
			
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int grid[][]= {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        int m=grid.length;
        int n=grid[0].length;
        int maxLocal[][]=new int [m-2][n-2];
        
        for(int i=0;i<m-2;i++)
        {
        	for(int j=0;j<n-2;j++)
        	{
        		maxLocal[i][j]=findmax(grid,i,j);
        		System.out.print(maxLocal[i][j]+" ");
        	}
        	System.out.println();
        }
        
		
	}

}
