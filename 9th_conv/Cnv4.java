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


}

class Son extends Father{
	public void printInfo()
	{
		System.out.println("This is Son ");
	}
	
	public void playGame()
	{
		System.out.println("playGame ");
	}
}

class Daughter extends Father{
	public void printInfo()
	{
		System.out.println("This is Daughter ");
	}

}

public class Cnv4{

	public static void main(String argv[])
	{
		Father f = new Father();
		Son s = new Son();
		Daughter d = new Daughter();

		print(f);
		print(s); //<--------------
		print(d); //<--------------
	}

	public static void print(Father f) //<--------------
	{
		f.printInfo();
	}

}




