package leetcode11;

import java.util.ArrayList;

public class arrangeCoins2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//int n=2147483647;
		
		int n=2147483647;
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		int T0=0, T1=1, T2=3;
		arr.add(T0);
		arr.add(T1);
		arr.add(T2);
		int fs=0,s=3;	
		while(fs<=n)
		{
		   fs=arr.get(s-1)+s;	
		   arr.add(fs);
		   s++;  
		}
		
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
		 
	}

}
