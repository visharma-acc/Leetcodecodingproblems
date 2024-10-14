package leetcode12;

public class rowAndMaximumOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]mat = {{0,0,0},{0,1,1}};
		int res[]= new int[2];
		
		int m=mat.length;
		int n=mat[0].length;
		int max=0;
		
		for(int i=0;i<m;i++)
		{
			int count=0;
			for(int j=0;j<n;j++)
			{
				if(mat[i][j]==1)count++;
			}
			if(max<count)
			{	
				max=count;
				res[0]=i;
				res[1]=max;
			}	
		}
		
		System.out.println(res[0]+" "+res[1]);
	}

}
