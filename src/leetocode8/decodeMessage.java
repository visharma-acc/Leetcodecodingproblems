package leetocode8;

import java.util.HashMap;

import com.mysql.cj.protocol.Message;

public class decodeMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://leetcode.com/problems/decode-the-message/
		String key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv";
		int len=key.length();
		HashMap<Character, Character> hm=new HashMap<Character, Character>();
		int counter=0,i=0,characterset=97;
		
		
		while(i<len)
		{
		   if(key.charAt(i)!=' ')
		   {	
			   if(hm.containsKey(key.charAt(i)))
			   {
				   i++;
			   }
			   else
			   {
				   char t=(char)characterset;
				   System.out.println(t);
				   hm.put(key.charAt(i),t);
				   characterset++;
				   counter++;
				   i++;
			   }
		   }
		   else
		   {
			   i++;
		   }
		   if(counter==26)break;
		}
		System.out.println(hm);
		System.out.println(hm.size());

		   char st[] =message.toCharArray();
		   for(int j=0;j<st.length;j++)
		   {
			   if(st[j]!=' ')
			   st[j]=hm.get(st[j]);
		   }
		   
		   System.out.println(new String(st));
		   
	}
 
	
	
}
