class Person{
	private int age;
	
	public void setAge(int age)
	{
		if(age<0 || age>200)
			age = 0;
		else		
			this.age = age;
	}

	public int getAge()
	{
		return this.age;
	}

	public void printInfo()
	{
		System.out.println("age = "+this.age);
	}

	public Person()
	{
		System.out.println("Person()");
	}
		
	public Person(int age)
	{ 
		System.out.println("Person(int age)");
		this.age = age; 
	}
}

class Student extends Person{
	private String school;
	
	public void setSchool(String school)
	{
		this.school = school;
	}

	public String getSchool()
	{
		return this.school;
	}

	Student(String school)
	{
		//will call the super() constructor, the empty one
		//super(); //= public Person()
		super(5);
		System.out.println("Student(String school)");
		this.school = school;
	}

	/* override */
	public void printInfo()
	{
		System.out.println("school = " + this.school + ", age = "+ getAge());
	}
}

public class Ext3{

	public static void main(String argv[])
	{
		Student s1 = new Student("abcd");
		//s1.setAge(1);
		System.out.println(s1.getAge());
		System.out.println(s1.getSchool());

		s1.printInfo();
	}
}
