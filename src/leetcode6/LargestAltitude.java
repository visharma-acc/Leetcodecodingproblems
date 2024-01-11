package leetcode6;

public class LargestAltitude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []gain = {-4,-3,-2,-1,4,3,2};
		int alt[]=new int[gain.length+1];
		alt[0]=0;
		int max=alt[0],len=gain.length;
		for(int i=0;i<len;i++)
		{
			alt[i+1]=alt[i]+gain[i];
			if(max<alt[i+1])max=alt[i+1];
			System.out.println(alt[i+1]);
		}
		
		System.out.println(max);

	}

}
