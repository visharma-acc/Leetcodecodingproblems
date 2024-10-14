package leetcode11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class largestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []nums = {3,30,34,5,9};
		
		String numbers []=new String[nums.length];
		
		for(int i=0;i<nums.length;i++)
		{
			numbers[i]=nums[i]+"";
		}
		
		   Comparator<String> lexographicalComparator = new Comparator<String>() {
	            @Override
	            public int compare(String X, String Y) {
	            	
	            	String XY=X+Y;
	            	String YX=Y+X;
	            	
	            	 int comparison = XY.compareTo(YX);
	            	
	                return comparison==0 ? 0 :(comparison>0 ?-1:1);
	            }
	        };
	        
	        boolean allZeros = Arrays.stream(nums).allMatch(num -> num == 0);
	        
	        if(allZeros)
	        	System.out.println("0");
	        else
	        {	
	        Arrays.sort(numbers,lexographicalComparator );
	        System.out.println(String.join("", numbers));
	        }
		
	
	}

}
