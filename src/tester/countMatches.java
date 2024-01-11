package tester;

import java.util.ArrayList;
import java.util.List;

public class countMatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<String>> items =new ArrayList<List<String>>();
		String ruleKey="color";
		String ruleValue="silver";
		int c=0;
		
		for(List<String> list:items)
		{
			if(ruleKey.equals("color"))
			{
				if(list.get(1).equals(ruleValue))
						c++;
			}
			else if(ruleKey.equals("type"))
			{
				if(list.get(0).equals(ruleValue))
					c++;
			}
			else
			{
				if(list.get(2).equals(ruleValue))
					c++;
			}
				
		}
		
	}

}
