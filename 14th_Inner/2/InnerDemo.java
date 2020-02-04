class Outer{

	private static int a = 10;

	static class Inner{

		public void printInfo()
		{
			System.out.println("a = "+a);
		}
	}


}

public class InnerDemo{

	public static void main(String argv[])
	{
		//Outer o = new Outer();
		//Outer.Inner i = o.new Inner();
		Outer.Inner i = new Outer.Inner(); //wrong, only when using with static it's possible
		i.printInfo();
	}	
}
