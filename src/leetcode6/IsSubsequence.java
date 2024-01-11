package leetcode6;

public class IsSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "axc", t = "ahbgdc";
		int len1=s.length();
		int i=0,j=0;
		while(i<len1)
		{
			if(s.charAt(i)==t.charAt(j))
			{
				i++;
				j++;
			}
			else
			{
				j++;
			}
			if(j==t.length()) break;
		}
		
		System.out.println(i);
		
		if(i==len1)
			System.out.println(true);
		else
			System.out.println(false);
	}

}
