abstract class Father{
	private int money;

	public int getMoney()
	{
		return this.money;
	}

	public void setMoney(int money)
	{
		this.money = money;
	}

	public abstract void study(); //son inherited from this class must define this method
}

class Son extends Father{
	public  void study()
	{
		System.out.println("I am studying");
	}
}

public class Ext6{

	public static void main(String argv[])
	{
		//Father f = new Father(); //cannot create an object of abstract class
		Son son = new Son();

		son.study();
	}
}
