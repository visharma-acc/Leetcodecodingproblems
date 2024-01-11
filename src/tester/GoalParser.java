package tester;

public class GoalParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String command = "(al)G(al)()()G";
		char []ch=command.toCharArray();
		int i=0, len=command.length();
		StringBuilder builder =new StringBuilder();
		while(i<len)
		{
			if(ch[i]=='G')
			{
				builder.append('G');
				i++;
			}
			else if(ch[i]=='(' && ch[i+1]==')')
			{
				builder.append('o');
				i=i+2;
			}
			else
			{
				builder.append("al");
				i=i+4;
			}
				
		}
		
		System.out.println(builder.toString());

	}

}
