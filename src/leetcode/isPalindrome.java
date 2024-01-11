package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5;
		
		int c=0;
		int y=x;
		boolean flag=true;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		while(y>0)
		{
		  int t=y%10;
		  arr.add(t);
		  y=y/10;
		  c++; 
		}
		
		System.out.println(arr);
		
	//	Arrays.sort(null);
		
		for(int i=0;i<arr.size();i++)
		{
		  if(arr.get(i)!=arr.get(c-i-1))
		  {
			flag=false;  
			break;
		  }
		}
		
		System.out.println(flag);
	
		
	}

}
