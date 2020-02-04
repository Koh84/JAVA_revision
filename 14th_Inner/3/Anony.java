interface A{
	public void printInfo();
}

class B implements A{

	public void printInfo(){
		System.out.println("Hello, World");
	}

}

public class Anony{

	public static void main(String argv[])
	{
		//B b = new B();
		//testFunc(b);
		testFunc(new B());
		testFunc(new A()
			{
				public void printInfo()
				{
					System.out.println("Hello, World 2");
				}
			}
		);
	}

	public static void testFunc(A a)
	{
		a.printInfo();
	}
}
