import java.util.HashMap;

public class NearbyDuplicate {

	public static void main(String[] args) {
		
	//	int nums[]= {1,2,3,1};
		int nums[]= {0,1,2,3,4,0,0,7,8,9,10,11,12,0};
				
				
		int k=1;
		
		  boolean flag=false;
	        
	        for (int i=0;i<nums.length-1;i++)
	             { for (int j=i+1;j<nums.length;j++)
	               { 
	                    if(nums[i]==nums[j] && i!=j)
	                    {
	                    	if(Math.abs(i-j)<=k)
	                    	{
	                    	  flag=true;	
	                    	}
	                    }
	               }    
	             }
	        
	        System.out.println(flag);
	        
	        boolean fg=false;
	        
	        HashMap<Integer, Integer> hm=new HashMap<>();
	        
	        for (int i=0;i<nums.length;i++)
	        {
	          if(hm.containsKey(nums[i]))
	          {
	        	  int j=hm.get(nums[i]);
	        	  if(Math.abs(i-j)<=k)
	        	  {
	        		  fg=true;
	        		  break;
	        	  }
	        	  else
	        	  {
	        		  hm.replace(nums[i], i);
	        	  }
	        	  
	          }
	          else
	          {
	        	  hm.put(nums[i], i);
	          }
	        	 
	        }
	        
	        
	        System.out.println(fg);
	        
	        System.out.println(hm);
	        
	        

	}

}
