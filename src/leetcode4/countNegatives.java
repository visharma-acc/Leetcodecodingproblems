package leetcode4;

public class countNegatives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
		
		int grid[][]= {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		
		int n=grid.length;
		int m=grid[0].length;
		
		int count=0;
		
		System.out.println(n+" "+m);
		
		for(int i=0;i<n;i++)
		{
		  for(int j=m-1;j>=0;)
		  {
			  if(grid[i][j]<0)
			  {
				  count++;
				  j--;
			  }
			  else
				break;  
		  }
		}
		
		
	System.out.println(count);	

	}

}
