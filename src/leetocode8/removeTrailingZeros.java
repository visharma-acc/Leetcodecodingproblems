package leetocode8;

public class removeTrailingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://leetcode.com/problems/remove-trailing-zeros-from-a-string/
		
		String num = "123";
		int len=num.length();
		int i;
		for(i=len-1;i>=0;i--)
		{
			if(num.charAt(i)!='0')break;
		    	
		}
		System.out.println(num.substring(0, i+1));
		
	}

}
