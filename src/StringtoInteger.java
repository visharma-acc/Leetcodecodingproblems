
public class StringtoInteger {

	public static void main(String[] args) {


		String s="   -4193 with words";
		
		int m=1,num;
		StringBuilder str=new StringBuilder();
		
		char c[]=s.toCharArray();
		
		for (int i=0; i<s.length();i++)
		{
			if((int)c[i]==32)
			{
				
			}
			else if((int)c[i]==45)
			{
				m=-1;
			}
			else if((int)c[i]>=48 && (int)c[i]<=57)
			{
			  str.append(c[i]);	
			}
			else
			{
				break;
			}
			
		}
		
		
		if(str.isEmpty())
		  num=0;	
		
		System.out.println(str);
		
		num=Integer.parseInt(str.toString());
		num=m*num;
		
		
		
		
		System.out.println(num);
		
		

	}

}
