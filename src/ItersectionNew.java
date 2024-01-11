import java.util.LinkedHashSet;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ItersectionNew {
	
	public static void main(String ars[])
	{
	int[] nums1= {1,2,2,1};
	int[] nums2= {2,2};
	
	
	LinkedHashSet<Integer> hs1=new LinkedHashSet<Integer>();
	LinkedHashSet<Integer> hs2=new LinkedHashSet<Integer>();

	
	
	for (int i=0; i<nums1.length;i++)
	{
		 hs1.add(nums1[i]);	
	}
	
	for (int i=0; i<nums2.length;i++)
	{
		 hs2.add(nums2[i]);	
	}
			
	
	hs1.retainAll(hs2);
	
	hs1.toArray();
	
	int num3[]=new int [hs1.size()];
	int l=0;
	
	for(Integer i:hs1)
	{
		num3[l++]=i.intValue();
	}
	
	
	
	System.out.println(hs1);

}

}