package leetcode3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SumUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  int nums []= {1,2,3,2};
	  int sum=0;
	 
		
     HashMap<Integer, Integer>hm= new HashMap<>();
      
      for (int i=0;i<nums.length;i++)
      {
   
    	  if(!hm.containsKey(nums[i]))
    		  hm.put(nums[i], 1);
    	  else
    	  {
    		  int tmp=hm.get(nums[i]);
    		  hm.replace(nums[i], tmp+1);
    	  }
        
      }
      
      for (Map.Entry<Integer,Integer> mapElement : hm.entrySet()) {
          int key = mapElement.getKey();

          
          // Adding some bonus marks to all the students
          if(mapElement.getValue()==1)
        	  sum=sum+key;

          // Printing above marks corresponding to
          // students names
      }
  
      System.out.println(hm);
      
      System.out.println(sum);
	  
	}

}
