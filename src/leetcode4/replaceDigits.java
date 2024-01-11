package leetcode4;

public class replaceDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="a1c1e1";
		char str[]=s.toCharArray();
		int len=str.length;
		for (int i=0;i<len;i=i+2)
		{ 
			int j=i+1;
			int t=str[i];
			//System.out.println(t);
			int t1= str[j]-49+1;
			//System.out.println(t1);
			str[j]=(char) (t+t1);
			//System.out.println(str[j]);
		}
		
		String s1=new String(str);
		System.out.println(s1);
	}

}
