package leetocode8;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String	s = "babad";
	    int dp [][]=new int [s.length()][s.length()];
	    
	    for(int i=0;i<s.length();i++)
	    {
	    	dp[i][i]=1;
	    }
	    
	    // dp(i,j)=d(i+1,j-1) and si==sj;
	    
	    for(int i=0;i<s.length();i++)
	    {
	    	for (int j=0;j<s.length();j++)
	    	{
	    		System.out.print(dp[i][j]);
	    	}
	    	System.out.println();
	    }

	}

}
