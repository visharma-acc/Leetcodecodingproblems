
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[]= {-1,0,3,5,9,12};
				
		int target=0;
	    System.out.println(search(nums, target));
	        
	        
	        
	}
	
	 public static int search(int[] nums, int target) {
	        
	        int R=nums.length-1;
	        int L=0;
	        int M=0;
	        
	        if(R==0)
	        {
	            return -1;
	        }
	        
	    
	        
	        System.out.println("First==+"+L);
            System.out.println("Middle==+"+M);
            System.out.println("Last==+"+R);
	     
	        while(L<R)
	        {
	        	System.out.println("Inside while");
	            M=(L+R)/2;
	            System.out.println("First=="+L);
	            System.out.println("Middle=="+M);
	            System.out.println("Last=="+R);
	            if(nums[M]>target)
	            {
	                R=M-1;
	            }
	            else
	            {
	                L=M+1;
	            }   
	            if(nums[M]==target)
	            {
	            	System.out.println("inside break-----");
	                 break;
	            }
	                
	        }
	        
	      

	        if(nums[M]==target)
	        {
	         System.out.println("inside target matched---");
	         System.out.println("-------"+M);
	          return M;
	        } 
	        else
	        {	
	        	System.out.println("inside target not matched---");
	          return -1;  
	        } 
	           
	        
	        
	    }

}
