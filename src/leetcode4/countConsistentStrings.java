package leetcode4;

public class countConsistentStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String allowed="abc";
		String[] words= {"a","b","c","ab","ac","bc","abc"};
		char[] tmp;
		int count=0;
		
		char[] array= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		for(int j=0;j<allowed.length();j++)
		{
		  int t=allowed.charAt(j)-97;			
		  array[t]=1;	
		}
		for(int i=0;i<words.length;i++)
		{
		  int c=0;	
		  tmp=words[i].toCharArray();
		  for(int k=0;k<tmp.length;k++)
		  {
			  int t1=tmp[k]-97;
			  if(array[t1]!=1) break;
			  else c++;
		  }
		  if(c==tmp.length) count++;
		}

		System.out.println(count);
	}

}
