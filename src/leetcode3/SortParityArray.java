package leetcode3;

public class SortParityArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[]= {0,3,4,1,3,5,7,8};
		
		int l=nums.length;
		
		for (int k=0;k<l;k++)
		{
		  System.out.print(nums[k]);	
		  if((nums[k]&1)!=1)
			  System.out.println("even");
		  else
			  System.out.println("odd");
		}
		
		int i=0,j=l-1;
		
		while(i<=j)
		{
		   if((nums[i]&1)!=1)
		   {  
			   System.out.println("even no");
			   System.out.println("inside if");
			   i++;
		   }   
		   else
		   {
			   System.out.println("odd no");
			   System.out.println("inside else");
			   if((nums[j]&1)!=1)
			   {
				   System.out.println("inside else if....");
				    nums[i]=nums[i]^nums[j];
				    System.out.println(nums[i]); 
				    nums[j]=nums[i]^nums[j];
				    System.out.println(nums[j]); 
				    nums[i]=nums[i]^nums[j];
				    System.out.println(nums[i]); 
				    i++;
				    j--;
			   }
			   else
			   {
				   System.out.println("inside inner else");
				   j--;
			   }
			
			   System.out.print(nums[i]); 
				
			   System.out.println("-----------------");
		   }
		   
		   System.out.println(l);
		   
			for (int k=0;k<l;k++)
			{
			  System.out.print(nums[k]);	
			}
		   
		}
		
	}

}
