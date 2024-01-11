package tester;

public class validPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = ",,,,,,,,,,,,acva";
		char []c=new char[s.length()];
		int k=0;
		
		for(int i=0;i<s.length();i++)
		{
			int ch=s.charAt(i);
			if(ch>=65 && ch<=90)
			   c[k++]=(char) (ch+32);
			else if(ch>=97 && ch<=122)
				c[k++]=(char)ch;
			else if(ch>=48 && ch<=57)
			{
				c[k++]=(char)ch;
			}
			else
			{}	
		}

		boolean flag=true;
		
		for(int g=0;g<k;g++)
		{
			System.out.println(c[g]);
		}
		
		int j=0;
		k=k=1;
		while(j<=k)
		{
		   if(c[j]!=c[k])
		   {
			   flag=false;
			   break;
			   
		   }   
		   else
		   {
			   j++;
			   k--;
		   }
		}
		
	}

}
