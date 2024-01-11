package tester;

public class finalValueAfterOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String operations[] = {"X++","++X","--X","X--"};
        int X=0;   
		
		for(String s:operations)
		{
			if(s.equals("X++") || s.equals("++X"))
				X=X+1;
			else
				X=X-1;
		}
		
		System.out.println(X);
		
		String address = "1.1.1.1";
		String s=address.replace(".", "[.]");
		
		System.out.println(s);
		
	}

}
