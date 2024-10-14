package leetcode10;

public class detectCapitalUse {
	public static int checkAllCaps(String str)
	{
		int flag=1;
		for(int i=0;i<str.length();i++)
		{
			int t=str.charAt(i);
			if(t>=65 && t<=90) {}
			else {flag=0; break;}
		}
		return flag;
	}
	public static int checkfirstonlyCaps(String str)
	{
		int flag=1;
		for(int i=0;i<str.length();i++)
		{
			int t=str.charAt(i);
			if(t>=65 && t<=90 && i!=0) {flag=0; break;}
		}
		return flag;
	}
	public static int all_lowercase(String str)
	{
		int flag=1;
		for(int i=0;i<str.length();i++)
		{
			int t=str.charAt(i);
			if(t>=97 && t<=122) {}
			else {flag=0; break;}
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="ananagh";
		int result=checkAllCaps(word);
		
		if(result==1)
			System.out.println("true");
		else
		{
			result=checkfirstonlyCaps(word);
			if(result==1)
				System.out.println("true");
			else
			{
				result=all_lowercase(word);
				if(result==1)
					System.out.println("true");
				else
					System.out.println("false");
			}
		}		
	}
}
