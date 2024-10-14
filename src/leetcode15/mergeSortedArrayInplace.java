package leetcode15;

public class mergeSortedArrayInplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int []nums1 = {1,2,3,0,0,0};
		int m = 3; 
		int []nums2 = {2,5,6};
		int n = 3;
		int k=n+m-1;
		int i=m-1, j=n-1;
		
		while(k>=0)
		{
			if(i>=0 && j>=0)
			{	
				if(nums1[i]>nums2[j])
				{
				nums1[k]=nums1[i];
				i--;
				}
				else
				{
				nums1[k]=nums2[j];
				j--;
				}
			  k--;
			}
			else
			{	
				if(j>=0)
				{
					nums1[k]=nums2[j];
					j--;
				}
			
				if(i>=0)
				{
					nums1[k]=nums1[i];
					i--;
				}
				k--;
			}
		}
		
	for(int i1=0;i1<n+m;i1++)
	{
		System.out.print(nums1[i1]+" ");
	}
		
	}

}
