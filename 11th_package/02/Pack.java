//javac Pack.java
//jar -cvf my.jar a
//export CLASSPATH=.:my.jar 
//export CLASSPATH=. reset directory search CLASSPATH

import a.b.c.d1.*; 
import a.b.c.d2.*; 

public class Pack{

	public static void main(String argv[])
	{
		/* add */
		System.out.println(a.b.c.d1.Math.add(1,2)); 
		System.out.println(a.b.c.d2.Math.add(1,2)); 

		/* sub */
		System.out.println(a.b.c.d2.Math.sub(1,2));
		a.b.c.d2.Print.printInfo();
		Print.printInfo();
		
	}
}
