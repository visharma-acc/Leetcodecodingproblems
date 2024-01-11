package leetcode3;

public class SpecialDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []prices = {8,4,6,2,3};
	    int l=prices.length;
	    
	    for(int i=0;i<l-1;i++)
	    {
	    	for(int j=i+1;j<l;j++)
	    	{
	    		if(prices[j]<=prices[i])
	    		{
	    			prices[i]=prices[i]-prices[j];
	    			break;
	    		}
	    			
	    	}
	    	
	    	
	    }
	    
	    for(int n:prices)
    	{
    		System.out.print(n+"\t");
    	} 

	}

}
