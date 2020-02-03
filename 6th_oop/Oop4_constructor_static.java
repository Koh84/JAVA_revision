
class Person{

	static int count;

	String name;
	int age;

	String getName(){
		return "guangdong " + name;
	}

	Person()
	{
		this.name = "";
		this.age = 0;
		count++;
	}

	Person(String name)
	{
		this.name = name;
		count++;
	}

	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
		count++;
	}

	static void printPerson()
	{
		System.out.println("This is a class Person");
	}
}


public class Oop4_constructor_static{

	public static void main(String args[])
	{

		Person p1 = new Person("zhangsan");
		//p1.printPerson();

		Person p2 = new Person("lisi", 2);
		//System.out.println(p2.getName());

		Person p3 = new Person();
		//System.out.println(p3.getName());

		//Person.printPerson();
		System.out.println(Person.count);
	}
}
