package leetcode7;

public class ArrayOrdering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	[2,7,5,8,4,3]: [2,8,4,3,5,7]
		int nums[]= {2,7,5,8,4,3};
		int l=nums.length;
		int i, j=0, c=l-1;
	    int res[]=new int[l];
	    for(i=0;i<l;i++)
	    {
	      if(nums[i]%2==0)
	      {
	    	  res[j]=nums[i];
	    	  j=j+1;
	      }
	      else
	      {
	    	  res[c]=nums[i];
	    	  c=c-1;
	      }
		}
	    for(i=0;i<l;i++)
	    	System.out.print(res[i]+" ");
		
	}

}
