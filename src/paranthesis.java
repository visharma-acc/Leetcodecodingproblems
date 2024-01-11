import java.util.ArrayList;
import java.util.Stack;

public class paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "(){}[]";
		
		 boolean flag=true;
		
		 if(s.length()%2!=0)
			 flag=false;

		 char[] ch=s.toCharArray();
		 
		 int slen=s.length();
		 int last=slen/2;
		 int first1=0;
		 int first2=0;
		
		// ArrayList<Character> l1=new ArrayList<Character>(last);
		// ArrayList<Character> l2=new ArrayList<Character>(last);
		  char[] l1=new char[last];
		  char[] l2=new char[last];
		  
		
		  
		  int top=0;
		
		  for(int i=0;i<ch.length;)
			 {
			    System.out.println("i=="+i);
			    System.out.println("top=="+top);
			 //   System.out.println("ch[i]=="+ch[i]);
			 //   System.out.println("ch[top]=="+ch[top]);
				 if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[') 
				 {
					 top++;
				 }
				 if(ch[i]==')' && ch[top-1]=='(')
				 {	 System.out.println("ch[i]=="+ch[i]);
				     System.out.println("ch[top]=="+ch[top]);
					 top--;
				 }	 
				 if(ch[i]=='}' && ch[top-1]=='{')
				 {	 
					 System.out.println("ch[i]=="+ch[i]);
				     System.out.println("ch[top]=="+ch[top]);
					 top--;
				 }	 
				 if(ch[i]==']' && ch[top-1]=='[')
				 {	 	 
					 System.out.println("ch[i]=="+ch[i]);
			         System.out.println("ch[top]=="+ch[top]);
					 top--;
				 }	 
				
				 i++;
			 }
		  
		  if(top==0)
		  {
			  System.out.println(top);
			  System.out.println(true);
		  }
		  else
		  {
			  System.out.println(top);
			  System.out.println(false);
		  }
		 
		 
		 /* 
		 for(int i=0;i<ch.length;i++)
		 {
			 if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[')
				 l1[first1++]=ch[i];
			 else if(ch[i]==')' || ch[i]=='}' || ch[i]==']')
				 l2[first2++]=ch[i];
			 else
			 {
				 
				 flag=false;
			 }	 
			
		 }
		 
		 System.out.println(l1);
		 System.out.println(l2);
		 
		 int l=l1.length;
		 
		 for(int i=0;i<l;i++)
		 {
			 if(l1[i]=='(' && l2[i]==')')
			 {}
			 else if(l1[i]=='{' && l2[i]=='}')
			 {}	 
			 else if(l1[i]=='[' && l2[i]==']')
			 {}	 
			 else
			 {
				 flag=false;
				 break;
			 }
				 
		 }
		 
		 System.out.println("result is "+flag);
		 
		 */
		
	}

}
