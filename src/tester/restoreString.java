package tester;

public class restoreString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String	s = "codeleet";
	int []indices = {4,5,6,7,0,2,1,3};
	char ch[]=new char[s.length()];
	
	for(int i=0;i<indices.length;i++)
	{
		ch[indices[i]]=s.charAt(i);
	}
	
	String s1=new String(ch);
	
	System.out.println(s1);
	
	String s2 = "Hello";
	char[] ch1=new char[s2.length()];

	for(int i=0;i<s2.length();i++)
	{
		int c=s2.charAt(i);
		if(c>=65 && c<=90)
		{	
			ch1[i]=(char)(c+32);
		}
		else  
		ch1[i]=(char)c;	
			
		
	}
	
	String s3=new String(ch1); 
	System.out.println(s3);
	
		
	}
	
	
}
