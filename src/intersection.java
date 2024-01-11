import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1= {1,2,2,1};
		int[] nums2= {2,2};
		
		
		   HashMap<Integer, Integer> hm=new HashMap<>();
		   
		   int i=0, j=0;
	       
		   LinkedHashSet<Integer> hs=new LinkedHashSet<>();
		   
		   int k=0;
		   
	        while(i<nums1.length || j<nums2.length)
	        {
	        
	        if(i<nums1.length)	
	        {	
	           if(!hm.containsKey(nums1[i]))
	            {
	                      hm.put(nums1[i], 1);	
	            }
	            else
	            {
	            	int tmp=hm.get(nums1[i]);
	            	if(tmp==1)
	            	{
	            		// duplicate elements in same array
	            	}
	            	else
	            	{
	            		hs.add(nums1[i]);
	            		//hm.put(nums1[i], 2);
	            	}
	            	
	            }
	        }
	        
	        if(j<nums2.length)
	        {	
	           if(!hm.containsKey(nums2[j]))
	           {
	        	   hm.put(nums2[j], 2);   
	           }
	           else
	           {
	        		int tmp=hm.get(nums2[j]);
	            	if(tmp==2)
	            	{
	            		// duplicate elements in same array
	            	}
	            	else
	            	{
	            	
	            		hs.add(nums2[j]);
	            		//hm.put(nums2[j], 1);
	            	}
	            	
	        	   
	           }
	        } 
	        System.out.println(hm);
	           i++ ;j++;
	            
	        }
	        
	        hs.toArray();
	        
	        int[] nums3= new int[hs.size()];
	        
	        System.out.println(hm);
	        System.out.println(hs);

	        int l=0;
           for(Integer t:hs)
           {
        	   nums3[l]=t.intValue();
        	   System.out.println(nums3[l]);
        	   l++;
        	   
           }
	        

	}

}
