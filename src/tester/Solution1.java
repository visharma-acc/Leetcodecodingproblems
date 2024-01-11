package tester;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[]= {100,100,-10,-20,-30};
		String D[]= {"2020-01-01","2020-02-01","2020-02-11","2020-02-05","2020-02-08"};
    
		   int i=0;
		HashMap<Integer, ArrayList<Integer>> hm =new HashMap<Integer, ArrayList<Integer>>();
		
		for(String s:D)
		{
			int m=Integer.parseInt(s.substring(5, 7));
			if(hm.containsKey(m))
			{
				ArrayList<Integer> ar=hm.get(m);
				ar.add(A[i]);
				hm.replace(m, ar);	
			}
			else
			{	
			 ArrayList<Integer> ar=new ArrayList<Integer>();
			 ar.add(A[i]);
			 hm.put(m, ar);
			}
			i++;
		}
		
		System.out.println(hm);
		 int total=0;
		
		for (Map.Entry<Integer,ArrayList<Integer>> mapElement : hm.entrySet()) {
            Integer key = mapElement.getKey();
 
            ArrayList<Integer> t=mapElement.getValue();
            int sum=0,c=0;
            for(int n:t)
            {
               if(n<0)	
               {
            	   c++;
            	   sum=sum+n;
               }
               	
              total=total+n; 
            }
            
            if(c<3 || total>-100)
            {
            	total=total-5;
            }
            
		}
		
		System.out.println(total);
		
		int l=hm.size();
		total=total-((12-l)*5);
		
		System.out.println(total);
		
	}

}
