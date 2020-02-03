class Father{
	private int money;

	public int getMoney()
	{
		return this.money;
	}

	public void setMoney(int money)
	{
		this.money = money;
	}

	public void printInfo()
	{
		System.out.println("This is Father " + money);
	}

	private void printInfo2()
	{
		System.out.println("This is Father " + money);
	}
}

class Son extends Father{
	public void printInfo()
	{
		System.out.println("This is Son " + getMoney());
	}
	//this is not an overide of private father's printInfo2()
	public void printInfo2()
	{
		System.out.println("This is Son " + getMoney());
	}
}

public class Ext5{

	public static void main(String argv[])
	{
		Son son = new Son();
		son.setMoney(100);
		
		son.printInfo();
	}
}
