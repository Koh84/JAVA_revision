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
}

class Student extends Person{
	
}

public class Ext{

	public static void main(String argv[])
	{
		Student s1 = new Student();
		s1.setAge(1);
		System.out.println(s1.getAge());
	}
}
