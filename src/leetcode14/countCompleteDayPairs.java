package leetcode14;

public class countCompleteDayPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int []hours = {12,12,30,24,24};
		 int count=0;
		 
		 for (int i=0;i<hours.length;i++)
		 {
			 for(int j=i+1;j<hours.length;j++)
			 {
				 if((hours[i]+hours[j])%24==0)count++;
			 }
		 }
		 System.out.println(count);

	}

}
