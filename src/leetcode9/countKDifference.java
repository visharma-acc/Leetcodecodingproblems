package leetcode9;

import java.util.HashMap;
import static java.lang.Math.*;

public class countKDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int []	nums = {1,3};
	 int k = 3;
    
     int count=0;
     
	 for (int i=0;i<nums.length;i++)
	 {
	  
		 for (int j=i+1;j<nums.length;j++)
		 {
			 if(abs(nums[i]-nums[j])==k)count++;
		 }
	 }
	 
	 System.out.println(count);
	 	 
	}


	
}
