package leetcode12;

public class deleteGreatestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [] []	grid = {{1,2,4},{3,3,1}};
	

	int m=2, n=3;
	int rowmax=0;
	int count=0, sum=0;
	int i=0,j=0;
	
	for(int p=0;p<n;p++)
	{
	for(i=0;i<m;i++)
	{   int max=0;
	    int columnindex=0;
		for(j=0;j<n;j++)
		{
			if(grid[i][j]>max)
			{
				max=grid[i][j];
				columnindex=j;
			}
		}
		System.out.println("max is"+max);
		grid[i][columnindex]=-1;
		rowmax=Math.max(rowmax, max);
		System.out.println("rowmax"+rowmax);
	}
	sum=sum+rowmax;
	rowmax=0;
	}
	
	System.out.println(sum);
	
	for(int k=0;k<m;k++)
	{  
		for(int l=0;l<n;l++)
		{
			System.out.print(grid[k][l]+" ");
		}
		System.out.println();
	}	
}
}