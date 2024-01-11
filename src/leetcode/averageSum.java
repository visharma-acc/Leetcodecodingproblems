package leetcode;

public class averageSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary[] = {4000,3000,1000,2000};
		
		double min=salary[0], max=salary[0],sum=0;
		
		for(int s:salary)
		{
			if(s<min)
				min=s;
			if(s>max)
				max=s;	
			sum+=s;
			
		}
		
		System.out.println("min="+min);
		
		System.out.println("max="+max);
		
		int n=salary.length-2;
		double avg=(sum-min-max)/n;
		System.out.println("avg is "+avg);

	}

}
