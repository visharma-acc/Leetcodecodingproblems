package leetcode11;

public class numberOfEmployeesWhoMetTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []hours = {0,1,2,3,4};
		int target = 6;
		int count=0;
		
		for (int i=0;i<hours.length;i++)
		{
			if(hours[i]>=target) count++;
		}

		System.out.println(count);
		
	}

}
