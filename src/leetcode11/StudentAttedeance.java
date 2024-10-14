package leetcode11;

public class StudentAttedeance {
	
	public static boolean neverlatefor3days(String s)
	{
	  for(int i=0;i<s.length()-2;i++)
	  {
		  if(s.charAt(i)=='L' && s.charAt(i+1)=='L'&& s.charAt(i+2)=='L')
		  return false;
	  }
	  return true;
	}

	public static boolean absentless2days(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		  {
			  if(s.charAt(i)=='A') count++;
			  if(count>2)return false;
		  }	
		 return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AAAA";
		
		System.out.println(neverlatefor3days(s));
		System.out.println(absentless2days(s));
		
		if(neverlatefor3days(s) && absentless2days(s))
			System.out.println("Student eligible for award");
		else
			System.out.println("Student not eligible for award");
		
		
	}

}
