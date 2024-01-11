package leetcode2;

public class multiplyStrings {
	
	public static double getNum(String s)
	{
		int l=s.length();
		double res=0;
		for(int i=0;i<s.length();i++)
		{
			int c=s.charAt(i)-48;
			System.out.println(c);
			res=res+Math.pow(10, l-i-1)*c;
			System.out.println(res);
			
		}
		System.out.println(res);
		return res;
	}

	public static void main(String[] args)
	
	{

		
		double ans=getNum("123456789")*getNum("987654321");
		System.out.println(ans);
		String t=ans+"";
		System.out.println(t);
		String str[]=t.split("\\.");
		System.out.println(str.length);

		System.out.println(str[0]);
	}
	
}
