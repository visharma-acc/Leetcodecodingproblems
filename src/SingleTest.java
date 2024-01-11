
public class SingleTest {

	private static SingleTest obj;
	
	private SingleTest(){}
	
	public static SingleTest getInstance()
	{
		if(obj==null)
			obj=new SingleTest();
		return obj;
	}
	
	
}
