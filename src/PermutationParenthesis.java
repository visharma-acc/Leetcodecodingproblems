import java.util.ArrayList;
import java.util.Arrays;

public class PermutationParenthesis {


	String[] solution(int n) {
	    
		 
		ArrayList<String> list=new ArrayList<String>();
		list=parentheses(n, 0, 0);
		System.out.println(list);
		 String[] myArray = new String[list.size()];
		 int i=0;
		 for (String s:list)
		 {
			 myArray[i]=list.get(i);
			 i++;
		 }
		 return(myArray);
				
				}
	
	  ArrayList<String> parentheses(int n, int left, int right) {

			ArrayList<String> results = new ArrayList<String>();

			  if (left == n && right == n) {
			    results.add("");
			  }

			  if (left < n) {
			    ArrayList<String> subResults = parentheses(n, left + 1, right);
			    for (String subResult : subResults) {
			      String newResult = "(" + subResult;
			      results.add(newResult);
			    }
			  }

			  if (left > right) {
			    ArrayList<String> oldResults = parentheses(n, left, right + 1);
			    for (String oldResult : oldResults) {
			      String newResult = ")" + oldResult;
			      results.add(newResult);
			    }
			  }

			  return results;
			}




	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PermutationParenthesis sol=new PermutationParenthesis();
		String str[] =sol.solution(3);
		
		
		System.out.println(str);

	}

}
