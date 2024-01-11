package leetcode2;

public class lengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="   fly me   to   the moon  ";
		String str=s.stripTrailing();
		
		int c=0;
		
		for (int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)!=' ')
			{
				c++;
			}
			else
			break;	
				
		}

		System.out.println(c);
		
		
	}

}
