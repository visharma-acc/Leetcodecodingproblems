package leetcode2;

import java.util.Arrays;
import java.util.HashSet;

public class firstMissingPositive3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []nums = {1};
		int n=nums.length;
		
	     HashSet<Integer> hs=new HashSet<>();
	     for(int i:nums)
	     {
	    	 if(i>0)
	    		 hs.add(i);
	     }
		
	     System.out.println(hs);
	     int res=0;
	     
	     for(int i=1;i<=n+1;i++)
	     {
	    	
	    	 if(!hs.contains(i))
	    	 {	 
	    		 res=i;
	    		 break;
	    	 } 	 
	     }
	     
	     
	     System.out.println("answer is "+res);
	     
	}

}
