
class Person{
	String name;
	int age;

	String getName(){
		return "guangdong " + name;
	}

	Person()
	{
		this.name = "";
		this.age = 0;
	}

	Person(String name)
	{
		this.name = name;
	}

	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}


public class Oop3{

	public static void main(String args[])
	{
		Person p1 = new Person("zhangsan");
		System.out.println(p1.getName());

		Person p2 = new Person("lisi", 2);
		System.out.println(p2.getName());

		Person p3 = new Person();
		System.out.println(p3.getName());
	}
}
