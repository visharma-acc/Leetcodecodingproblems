package leetcode6;

public class FindMaxAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://leetcode.com/problems/maximum-average-subarray-i/?envType=study-plan-v2&envId=leetcode-75
		
		int []nums = {-6662,5432,-8558,-8935,8731,-3083,4115,9931,-4006,-3284,-3024,1714,-2825,-2374,-2750,-959,6516,9356,8040,-2169,-9490,-3068,6299,7823,-9767,5751,-7897,6680,-1293,-3486,-6785,6337,-9158,-4183,6240,-2846,-2588,-5458,-9576,-1501,-908,-5477,7596,-8863,-4088,7922,8231,-4928,7636,-3994,-243,-1327,8425,-3468,-4218,-364,4257,5690,1035,6217,8880,4127,-6299,-1831,2854,-4498,-6983,-677,2216,-1938,3348,4099,3591,9076,942,4571,-4200,7271,-6920,-1886,662,7844,3658,-6562,-2106,-296,-3280,8909,-8352,-9413,3513,1352,-8825};
		int k = 90,max, sum=0, prev=nums[0],c=0;
		
		System.out.println(nums.length);
		
		for(int i=0;i<k;i++)
		{
          sum=sum+nums[i];
         // System.out.println(nums[i]);
		}
		max=sum;
		
		System.out.println(max);
		int t=max;
		
		for(int j=k;j<nums.length;j++)
		{
          t=t+nums[j]-prev;
          System.out.println("t="+t);
          c=c+1;
          prev=nums[c];
          System.out.println("prev="+prev);
          if(t>max)max=t;
          System.out.println("max="+max);
		}
		
		System.out.println(max);
		
		double res=(max*1.0)/k;
		System.out.println(res);
		
        		
		
	}

}
