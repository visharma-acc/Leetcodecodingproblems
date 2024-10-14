package leetcode14;

public class prefixofanywordinasentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String	sentence = "this problem is an easy problem", searchWord = "pro";
	 String words[]=sentence.split(" ");
	 for(int i=0;i<words.length;i++)
	 {
		if(words[i].startsWith(searchWord))
		{
			System.out.println("index "+(i+1));
			break;
		}	
		
	 }

	}

}
