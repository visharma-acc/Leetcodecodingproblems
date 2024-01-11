import java.util.ArrayList;
import java.util.Stack;

public class paranthesisStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "([[]])";
		
		 boolean flag=true;
		
		 if(s.length()%2!=0)
			 flag=false;
		 
		 char [] str=s.toCharArray();
		 
		//System.out.println(str);

         Stack<Character> stk=new Stack<>();
         Stack<Character> stk1=new Stack<>();
         
         System.out.println(stk.size());
         System.out.println(stk);
         for(int i=0;i<s.length();i++)
         {
        	 
          if(!stk.isEmpty() )
          {
        	System.out.println("inside if--"); 
        		 if( stk.peek()=='(' && str[i]==')')
        	      stk.pop();
        		 if( stk.peek()=='{' && str[i]=='}')
            	     stk.pop();
        		 if( stk.peek()=='[' && str[i]==']')
            	     stk.pop();
         }
          else
          {
        	  System.out.println("inside else");
        	  System.out.println("i=="+i+str[i]);
        	  stk.push(str[i]);
        	  System.out.println(stk);
          }
         
   
		

	}
         System.out.println(stk.size());
	}
}
