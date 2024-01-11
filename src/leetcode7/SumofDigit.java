package leetcode7;

public class SumofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abc123d5eff78g97";  //123+5+78+97

		char str[]=s.toCharArray();
		int total=0;		
		int c=0 ,i;
		for(i=0;i<str.length;i++)
		{
			int tmp=str[i];
			if(tmp>=49 &&  tmp<=57)
			{
		      c=c+1;
			}
			else
			{
				String tm=s.substring(i-c, i);
				if(tm.length()>0)
				{
				int t=Integer.parseInt(tm);
				total=total+t;
				}
				c=0;
			}
		}
	
	total=total+ Integer.parseInt(s.substring(i-c, i));
	
	System.out.println(total);
	}

}
