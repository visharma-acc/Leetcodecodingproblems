package leetcode6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class RemoveStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bttncfrboqlxusuvkqulcgmzpglunovooqeafppajbrndyqnhpbelrfjrlqvskolhjkyfsluijulhjuojgqhncqwtasjrqhbsoscclvpvbxqlccygousanvytynpbxlvrqzkacqzvqvnrnsrbqqnsfknxnbpfyepemrtlxrqdzgtnvsyfvhpzcbmllsqzvyqfxmtxmztvxypvkdfhegteqydxkxcqxtsovzqchsrolxhkdqotidqmszsuomwcxhrgysquivrqjgpnsjtnogbtyfgyubrozdceorhijlrmrigpyauorwdepaelavdhgvnunyyteubcbnislvllqswyvvtrwkqvykmntwkpdryrpehlkbfdvsywowholozpvwvagnginlkquhvkpsxnevtoefwscmupjcamlsnxxyhxccmyokqsuykklcysgruhldskmmmkuagtaekiimghkahriuibrrdbcfcijqxwcqmwvuauxxvmlibgluovuvommnszquukvsftlllahgpjtjfhslhudcxyxyptsgzvpzxdzkauqlbviiwmkhrcmlqbegjlnplatrczotzkwjcpxqcxqigdpdauabxpmexfumgflleqxcnlpxxargnvniztwubgrfsvdkgqptzpxguoquxveswscreoxikjbpxcurksagzanqxbojpjuidnxkzbygshnploghixjmfmbqjjpusgugeeslsonnrvzfaoelcwjhnzonqukuvygnddifiycruvkuaklxnuqplnllgxpqbqlfpzdyeuruokfgyshihxwwulniiyuyurdlhdniqdjmzztnxeitfrjpepnqwslsprvnmidnmxlyqmrncyiepascjpmfkdsliqppmrzdovjiysrorcqrvbakmbgviyklxhqoucwcmgoqttlvpihegdvpmvsbkzatqdhuruytjhzazhbprkrscayscomvapbmxycdfuiqvfinqudxying...";
		Stack<Character> str=new Stack<>();
		for (int i=0;i<s.length();i++)
		{
		  if(s.charAt(i)!='*')
		  {
			  str.push(s.charAt(i));
			  System.out.println(str);
		  }
		  else
		  {
			  str.pop();
			  System.out.println("element removed");
			  System.out.println(str);
		  }
		 
		  
		}
		
		ArrayList<String> arr=new ArrayList<>();
		for (int i=0;i<s.length();i++)
		{
		  if(s.charAt(i)!='*')
		  {
			  arr.add(s.charAt(i)+"");
			  System.out.println(arr);
		  }
		  else
		  {
			  arr.remove(arr.size()-1);
			  System.out.println("element removed");
			  System.out.println(arr);
		  }
		 
		  String res=String.join("", arr);
		  System.out.println(res);
		  
		}

	}

}
