package leetcode12;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ExampleSet {
	
	 public static void main(String[] args) {
		    ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(5);
		    numbers.add(9);
		    numbers.add(8);
		    numbers.add(1);
		    numbers.forEach( (n) -> { System.out.println(n);});
			
		    ArrayList<Integer> squares = (ArrayList<Integer>) numbers.stream()
                    .map(x -> x * x)
                    .collect(Collectors.toList());
		    System.out.println(squares);
		    
		    ArrayList<Integer> squares1 = (ArrayList<Integer>) numbers.stream()
                     .filter(x->x%2==0)
                    .collect(Collectors.toList());
		    
		    System.out.println(squares1);
		    
		  }

}
