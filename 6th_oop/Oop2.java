
class Person{
	String name;
	String getName(){
		return "guangdong " + name;
	}

	Person(String name)
	{
		this.name = name;
	}
}


public class Oop2{

	public static void main(String args[])
	{
		Person p1 = new Person("zhangsan");
		System.out.println(p1.getName());

		Person p2 = new Person("lisi");
		System.out.println(p2.getName());
	}
}
