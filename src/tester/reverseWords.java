package tester;

public class reverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = " hello world ";
		String s1=s.trim();
		
		String str[]=s1.split(" ");
		int l=str.length;
		StringBuilder builder=new StringBuilder();
		for(int i=l-1;i>=0;i--)
		{
			System.out.println(str[i].length());
			if(str[i].length()!=0)
			{	
			builder.append(str[i]);
			if(i!=0)
			builder.append(" ");
			}
		}
		
		System.out.println(builder.toString());
		
		int n=10;
		
		int prime =23;
		
		int rand=(n+prime)%11;
		
		System.out.println(rand);
		

	}

}
