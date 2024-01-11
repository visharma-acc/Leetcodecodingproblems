package leetcode;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] height= {1,8,6,2,5,4,8,3,7};
		
		int max=0;
		int last=height.length-1;
		
		for(int start=0;start!=last;)
		{
			int l=Math.min(height[start], height[last]);
			int currentmax=l*(last-start);
			max=Math.max(max, currentmax);
			if(height[start]<height[last])
			start++;
			else
			 last--;	
		}
		
		System.out.println("max is "+max);

	}

}
