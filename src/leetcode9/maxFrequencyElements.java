package leetcode9;

import java.util.HashMap;

public class maxFrequencyElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []nums = {1,2,2,3,1,4};
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for (int i:nums)
		{
			if(!hm.containsKey(i)) hm.put(i, 1);
			else hm.replace(i, hm.get(i)+1);
		}
		
		   int maxFreq = Integer.MIN_VALUE;
	        for (Integer key : hm.keySet()) {
	            if (hm.get(key) > maxFreq) {
	            	maxFreq = hm.get(key);
	            }
	        }
		
		System.out.println(hm);
		System.out.println(maxFreq);
		  
		  int count=0;
		
		  for (Integer key : hm.keySet()) {
	            if (hm.get(key) == maxFreq) {
	            	count++;
	            }
	        }
		
	  System.out.println(count*maxFreq);	  
	}

}
