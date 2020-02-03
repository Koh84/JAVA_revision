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
		this.school = school;
	}
}

public class Ext2{

	public static void main(String argv[])
	{
		Student s1 = new Student("abcd");
		s1.setAge(1);
		System.out.println(s1.getAge());
		System.out.println(s1.getSchool());
	}
}
