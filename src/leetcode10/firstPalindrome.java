package leetcode10;

public class firstPalindrome {
	
	public static int checkpalindrome(String s)
	{
	  int l=s.length()-1,  i=0;
	  while(i<l)
	  {
		  if(s.charAt(i)==s.charAt(l))
		  {
			  i++;
			  l--;
		  }
		  else
		  return 0;	  
	  }
	  return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String words[] = {"abc","car","ada","racecar","cool"};
		
		for( String str: words)
		{
			if(checkpalindrome(str)==1) break;
			
		}
	}

}
