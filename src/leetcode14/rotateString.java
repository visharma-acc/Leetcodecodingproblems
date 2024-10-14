package leetcode14;

public class rotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde", goal = "abced";
		if(s.length()!=goal.length())
			System.out.println(false);
		int l=s.length();
		for(int i=1;i<s.length();i++)
		{
			StringBuilder builder=new StringBuilder();
			builder.append(s,i,l);
			builder.append(s, 0, i);
			
			System.out.println(builder);
			
			if(goal.equals(builder.toString()))
			{
				System.out.println(true);
				break;
			}
			
		}

	}

}
