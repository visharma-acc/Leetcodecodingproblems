package leetcode10;

public class nextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int []	nums1 = {2,4}, nums2 = {1,2,3,4};
	 
	 int res[]=new int [nums1.length];
	 int l=nums1.length;
	 for(int i=0;i<l;i++)
	 {
		 int flag=0;
		 for (int j=0;j<nums2.length;j++)
		 {
			 int index=-1;
			 if(nums1[i]==nums2[j])
			 {
				index=j; 
				 flag=1;
			 }
			 
			 if(flag==1 && j>index && nums2[j]>nums1[i])
			 {
				 res[i]=nums2[j];
				 break;
			 }
		 }
		 if(res[i]==0)
			 res[i]=-1;
		 
		 System.out.println(res[i]);
	 }

	}

}
