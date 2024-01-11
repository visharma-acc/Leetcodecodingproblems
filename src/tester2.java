
public class tester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums ={-1,-2,-3,-4,-5};
		int target =-8;
		int res[]=new int[2];
		
	    for (int i=0;i<nums.length-1;i++)
        { int sum=0;
         
            for (int j=1; j<nums.length;j++)
            {
                sum=nums[i]+nums[j];
                if(sum==target && i!=j)
                {
            	    System.out.println(nums[i]+" "+nums[j]); 
            	    
                	
                 res[0]=i;  
                 res[1]=j; 
                 System.out.println(res[0]+"  "+res[1]);
                 break;   
                }
            }
        }
	    
	    //System.out.println(res[0]+"  "+res[1]);
		
	}
		
	}


