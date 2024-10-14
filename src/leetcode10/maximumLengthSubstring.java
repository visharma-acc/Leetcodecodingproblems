package leetcode10;

public class maximumLengthSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  s = "bcbbbcba";
		int l=s.length();
		int [] ch=new int[26];
		for(int i=0;i<26;i++)
		{
			ch[i]= 0;
		}
		
		int count=0;
		int index=0;
		
		for(int j=index;j<l;j++)
		{
			char c=s.charAt(j);
			int t=c;
			if(ch[t]==1) {
				index=index+1;
				count=0;
			} ;
			ch[t]=ch[t]+1;
			count++;
		}

	}

}
