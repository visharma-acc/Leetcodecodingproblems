package leetcode5;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abc";
		String t="ahbgdc";
		int slen=s.length();
		int tlen=t.length();
		
		int l=0,r=0;
		
		while(l<slen)
		{
			if(r==tlen)
			{
				System.out.println("checking string t lenght");
				break;
			}	
			if(s.charAt(l)==t.charAt(r))
			{
				System.out.println("inside if");
				l++;
				r++;
			}
			else
			{
				System.out.println("inside else");
				
				r++;
			}
			
			System.out.println("l= "+l);
			System.out.println("r= "+r);
			
		}
		
		if(l==slen)
			System.out.println("sequence present");
		else
			System.out.println("sequence not present");
		
	}

}
