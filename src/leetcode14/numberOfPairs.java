package leetcode14;

public class numberOfPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int []nums1 = {1,2,4,12};
	int nums2[] = {2,4};
	int k = 3;
	int count=0;
	
	for(int i=0;i<nums1.length;i++)
	{
		for(int j=0;j<nums2.length;j++)
		{
			if(nums1[i]%(nums2[j]*k)==0) count++;
		}
	}
	System.out.println(count);
 }
}
