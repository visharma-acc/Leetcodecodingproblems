package tester;

import java.util.Arrays;
import java.util.Collections;

public class rearrangeworkds {

	public static void main(String[] args) {
	String s = "is2 sentence4 This1 a3";
    String str[]=s.split(" ");
    String st1[]=new String[str.length];
    StringBuilder builder=new StringBuilder();
    for(String t:str)
    {
    	System.out.println(t);
    	int i=(int)t.charAt(t.length()-1)-48;
    	System.out.println(i);
    	st1[i-1]=t.substring(0, t.length()-1);
    }
    
    //Arrays.sort(str);
    //System.out.println(str);
    
    for(int i=0;i<st1.length;i++)
    {
    	//System.out.print(st1[i]+" ");
    	builder.append(st1[i]);
    	builder.append(" ");
    }
	
   // System.out.println(Arrays.toString(st1));
    
    System.out.println(builder.toString().trim());
	}		
	
}
