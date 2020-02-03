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

interface A{
	public static final int i = 10;
	public abstract int getNum();
}

interface B{
	public static String name = "InterfaceB";
	public abstract String getName();
}



class Son extends Father implements A,B{
	public  void study()
	{
		System.out.println("I am studying");
	}

	public int getNum()
	{
		return i;
	}

	public String getName()
	{
		return name;
	}
}

public class Ext7{

	public static void main(String argv[])
	{
		//Father f = new Father(); //cannot create an object of abstract class
		Son son = new Son();

		son.study();
		System.out.println(son.getNum());
		System.out.println(son.getName());
	}
}
