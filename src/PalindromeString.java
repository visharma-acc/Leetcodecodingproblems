
public class PalindromeString {
	
	public static void main(String ars[])
	{
		String s="ABCDCBA";
		
		int l=s.length();
		int flag=l/2;
		
		for(int i=0;i<(l/2);i++)
		{
		  if(s.charAt(i)==s.charAt((l-1)-i))
			  flag--;
		    
		}
		
		System.out.println("flag="+flag);
		
		
		if(flag==0)
			System.out.println("String palindrom..");
		else
			System.out.println("String not a palindrome..");
		
		
	}

}
