package leetcode;

import java.util.HashMap;

public class letterCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<Character, String>hm=new HashMap<Character, String>();
      hm.put('2',"abc" );
      hm.put('3',"def" );
      hm.put('4',"ghi" );
      hm.put('5',"jkl" );
      hm.put('6',"mno" );
      hm.put('7',"pqrs" );
      hm.put('8',"tuv" );
      hm.put('9',"wxyz" );
     
      
      String digits = "23";
      int k=0;
      int l=digits.length();
      char[] n=new char[l];
     String s[] =new String[l];
 
      StringBuilder str =new StringBuilder();
      for(int i=0;i<l;i++)
      {
    	  System.out.println(digits.charAt(i));
    	  n[k]=digits.charAt(i);
    	  
    	  String t=hm.get(digits.charAt(i));
    	  s[i]=t;
    	  System.out.println(t);
    	  
    	  str.append(hm.get(digits.charAt(i)));
      }	  
      
      for (String s1:s)
      {
    	  
      }
      
      System.out.println(str);
      System.out.println(s);
      
    	  
    
	}

}
