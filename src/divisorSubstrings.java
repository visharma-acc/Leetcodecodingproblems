
public class divisorSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 430043, k = 2, c=0;
		
		String s=Integer.toString(num);
		
		int arr[]=new int[s.length()];
		
		for(int i=0;i<s.length();i++)
		{
			arr[i]=Character.getNumericValue(s.charAt(i));
		}
		
		for(int i=0;i<s.length();i++)
		{
			if(i+k<=s.length())
			{
			String temp=s.substring(i, i+k);
			System.out.println(temp);
			int n=Integer.parseInt(temp);
			if(n>0 && num%n==0)
			{
				c++;
			}
			}
		}
		

		System.out.println("c="+c);
		
	}

}
