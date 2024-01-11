import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class klargest {

	int solution(int[] inputArray, int k) {

		  class Helper {
		    int[] listToArray(List<Integer> data) {
		      int[] res = new int[data.size()];
		      for (int i = 0; i < data.size(); i++) {
		        res[i] = data.get(i);
		      }
		      return res;
		    }
		  };

		  int pos = (new Random()).nextInt(inputArray.length);
		  System.out.println(pos);
		  List<Integer> left = new ArrayList<>();
		  List<Integer> right = new ArrayList<>();

		  if (inputArray.length == 1) {
		    return inputArray[0];
		  }

		  for (int i = 0; i < inputArray.length; i++) {
		    if (inputArray[i] <= inputArray[pos]) {
		      left.add(inputArray[i]);
		    }
		    else {
		      right.add(inputArray[i]);
		    }
		  }
		//  System.out.println(left);
		//  System.out.println(right);

		  Helper h = new Helper();
		//  int a1[]=h.listToArray(left);
		//  int a2[]=h.listToArray(right);
		  
		  Arrays.sort(inputArray);
		
		
          return inputArray[(inputArray.length)-k];

		  
		 
		
	

		
		}
	

	  

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		klargest ob=new klargest();
		int[] inputArray= {19, 32, 11, 23};
		System.out.println(ob.solution(inputArray, 3));

	}

}
