package leetocode8;

public class prefixCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[]words = {"pay","attention","practice","attend"};
	String	pref = "at";
	int count=0, preflen=pref.length();
	
	for(String s:words)
	{if(s.length()>=preflen && s.substring(0, preflen).equals(pref))count++;}
	System.out.println(count);
	}

}
