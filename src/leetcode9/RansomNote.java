package leetcode9;

public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ransomNote="bg";
		String magazine="efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";

		char rn[]=ransomNote.toCharArray();
		char mg[]=magazine.toCharArray();
		int count=0;
		
		for(int i=0;i<ransomNote.length();i++)
		{
			for(int j=0;j<magazine.length();j++)
			{
				if((rn[i]^mg[j])==0)
					{count++;
					mg[j]=(char) -1;
					break;
					}
			}
		}
		
		for(int j=0;j<magazine.length();j++)
		{
			System.out.println(mg[j]);
		}
		
		System.out.println(count);
	}

}
