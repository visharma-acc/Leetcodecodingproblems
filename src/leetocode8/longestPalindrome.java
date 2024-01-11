package leetocode8;

public class longestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://leetcode.com/problems/longest-palindrome/submissions/
		
		String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
		char[] ch=s.toCharArray();
		int tot=0;
		int l=s.length();
		
		int arr[] =new int [58];
		
		for(int i=0;i<l;i++)
		{
			//System.out.println(ch[i]);
			int t=ch[i];
		    //System.out.println(t-65);
			//System.out.println(t);
			arr[t-65]=arr[t-65]+1;
			//System.out.println(arr[t-65]);
		}
		
		for(int i=0;i<58;i++)
		{	if(arr[i]>1)
		    {
				if((arr[i]^1)!=(arr[i]+1))
					tot=tot+arr[i]-1;
				else
					tot=tot+arr[i];
				System.out.print(arr[i]+" ");
				System.out.println(tot);
		    }
		}
		
		System.out.println(tot);
		System.out.println(tot^1);
		
		if((tot^1)==(tot+1))
		{
			
			if(l>tot)
				tot=tot+1;
			System.out.println(tot);
		}
		else
		{
			System.out.println(tot);
		}

	}

}
