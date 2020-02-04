package a;
import b.*;

class Mymath2 extends Mymath{
	
	public void printInfo()
	{
		System.out.println(x);
	}	
}

public class Pack{

	public static void main(String argv[])
	{
		Mymath2 m = new Mymath2();
		
		m.printInfo();
	}
}
