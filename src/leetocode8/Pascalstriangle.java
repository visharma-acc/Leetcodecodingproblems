package leetocode8;

import java.util.ArrayList;
import java.util.List;

public class Pascalstriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		int dp[][]=new int[n][n];
		int j=0, k=n-1;
		for(int i=n-1;i>=0;i--)
		{
			dp[i][0]=1;
			dp[i][k]=1;
			j++;
			k--;
		}
		
		for(int i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
				System.out.print(dp[i][j]+" ");
		    System.out.println();	
		}
		
		System.out.println("********************************");
		
		for(int i=2;i<n;i++)
		{
			for(j=1;j<i;j++)
			{
			  	dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
			}
		}
		
		for(int i=0;i<n;i++)
		{
			ArrayList<Integer> arr=new ArrayList<Integer>();
			for(j=0;j<=i;j++)
			{	
				System.out.print(dp[i][j]+" ");
				arr.add(dp[i][j]);
			}	
			list.add(arr);
		    System.out.println();	
		}
		
		System.out.println(list);

	}

}
