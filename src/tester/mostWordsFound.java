package tester;

public class mostWordsFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		int x=0, max=0;
		for(String s:sentences)
		{
		 x=s.split(" ").length;
		 max=Math.max(x, max);
		}

		System.out.println(max);
	}

}
