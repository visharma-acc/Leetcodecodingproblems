package tester;

public class balancedStringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "RLRRLLRLRL";
		
		char [] ch=s.toCharArray();
		int ans=0, bal=0;
		
		for (int i=0;i<ch.length;i++)
		{
			if(ch[i]=='L')
				bal++;
			else
			    bal--;
			
			if(bal==0)
				ans++;
			
		}
		
		System.out.println(ans);

	}

}
