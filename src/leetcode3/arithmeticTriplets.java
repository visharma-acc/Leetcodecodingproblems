package leetcode3;

public class arithmeticTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int []	nums = {0,1,2};int diff = 1,c=0;
	
	int l=nums.length-1;
	int i=0,j=i+1,k=j+1;
	while(i<=l-2)
	{
	    if(nums[j]-nums[i]==diff)
	    {
	    	if(nums[k]-nums[j]==diff)
	    	{	
	    		c++;
	    		i++;
	    		j=i+1;
	    		k=j+1;
	    		System.out.println("triplet found...");
	    		System.out.println("i= "+i+" j= "+j+" =k "+k);
	    	}	
	    	else
	    	{	if(k<l)
	    		k++;
	    	    else
	    	    {	
	    	    	i++;
		    		j=i+1;
		    		k=j+1;
	    	    }	
	    		
	    	}	
	    		
	    }
	    else
	    {
	    	if(j<l-1)
	    	j++;
	    	else
	    	{
	    		i++;
	    		j=i+1;
	    	}
	    }
	    
	    System.out.println("i= "+i+" j= "+j+" =k "+k);
	    
	}
	
	

	}

}
