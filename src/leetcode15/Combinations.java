package leetcode15;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4, k = 2;
		
		int arr [] =new int [n];
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		
		for(int i=1;i<=n;i++)
			arr[i-1]=i;
			
		for(int i=1;i<=n;i++)
		{
		  for(int j=i+1;i<=n;j++)
			{
				if(i+j==k) 
				{
					List<Integer> l=new ArrayList<Integer>();
					l.add(i);
					l.add(j);
					list.add(l);
					
				}
					
			}
		}
		

	}

}
