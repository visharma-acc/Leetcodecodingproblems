package leetcode;

public class mergeSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []nums1 = {2,0};
		int m = 2;
		int []nums2 = {1} ;
		int n = 1;
		
		int i=0,j=0;
		
		while(i<m && j<n)
		{
			if(nums1[i]<nums2[j])
			{
				System.out.println("inside if ");	
			   nums1[i]=nums1[i];
			   System.out.println("value of nums1 "+ nums1[i]);
			   System.out.println("value of i "+ i);
			   i++;
			 
			}
			else if(nums1[i]>nums2[j])
			{
				int t=nums1[i];
				System.out.println("inside else if ");	
				nums1[i]=nums2[j];
				nums2[j]=t;
				 System.out.println("value of nums1 "+ nums1[i]);
				 System.out.println("value of nums2 "+ nums2[j]);
				 System.out.println("value of i "+ i);
				 System.out.println("value of j "+ j);
				 i++; 
				 j++;
				
			}
			else
			{
				System.out.println("else ");	
				int t=nums1[i+1];
				nums1[i]=nums1[i];
				 System.out.println("value of nums1 "+ nums1[i]);
				 System.out.println("value of i "+ i);
				
				i++;
				nums1[i]=nums2[j];
				i++;
				nums2[j]=t;
				 System.out.println("value of nums2 "+ nums2[j]);
				System.out.println("value of j "+ j);
				
			
			}
		
		}
		
		while(i<m)
		{
			nums1[i]=nums1[i];
			i++;
		}
		
		while(j<n)
		{
			nums1[i]=nums2[j];
			i++;
			j++;
		}

		for(int k=0;k<m;k++)
			System.out.print(nums1[k]+"\t");
		
	}

}
