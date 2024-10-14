package leetocode8;

import java.util.ArrayList;
import java.util.List;

public class fizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		List<String> list=new ArrayList<String>();
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 && i%5==0) list.add("\"FizzBuzz\"");
			else if(i%3==0) list.add("\"Fizz\"");
			else if(i%5==0) list.add("\"Buzz\"");
			else list.add("\""+i+"\"");
		}
		System.out.println(list);

	}

}
