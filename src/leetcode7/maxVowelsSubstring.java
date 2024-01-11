package leetcode7;

public class maxVowelsSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "leetcode";
		int k = 3;
		int l=s.length();
		int t=0, max=0;
		
		for(int i=0;i<k;i++)
		{
		  if(s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ) t++;
		}  
		
		System.out.println("inital t is "+t);
		
		if(max<t)max=t;
		
		for(int i=k;i<l;i++)
		{
		  
		  if(s.charAt(i-k)=='a'|| s.charAt(i-k)=='e' || s.charAt(i-k)=='i' || s.charAt(i-k)=='o' || s.charAt(i-k)=='u' )t--;	 	
		  if(s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ) t++;
		
		  if(max<t)max=t;
		  if(max==k)break;
		}
		
		System.out.println("final t is "+t);
		System.out.println("final max is "+max);
	}

}
