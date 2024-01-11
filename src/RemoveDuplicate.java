import java.util.LinkedHashSet;

public class RemoveDuplicate {
	
	public static void main(String ars[])
	{
		int arr[]= {10,20,20,30,30,40,40,50,50};
		
	    LinkedHashSet<Integer> lm=new LinkedHashSet<Integer>();
	    
	    for (int i=0;i<arr.length;i++)
	    {
	    	lm.add(arr[i]);
	    }
	    
	    System.out.println(lm);
	    int n=arr.length;
	    
	    int temp[]=new int[n];
	    
	    int j=0;
	    
	    for (int i=0;i<n-1;i++)
	    {
	    
	    	if(arr[i]!=arr[i+1])
	    	{
	    	 	temp[j]=arr[i];
	    	 	j++;
	    	}
	    }
	    
	
	    temp[j]=arr[n-1];
	    
	    for (int i=0;i<=j;i++)
	    {
	    
	    	System.out.println("i="+i+" "+temp[i]);
	    }
		
		
		
	}

}
