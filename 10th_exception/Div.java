//java Div 6 2
//6/2 = 3

public class Div{

	public static void main(String argv[])
	{
		int m = Integer.parseInt(argv[0]);
		int n = Integer.parseInt(argv[1]);
		

		System.out.println("Beginning of DIV");
		int r = div(m,n);
		System.out.println("End of DIV");
		System.out.println(m+"/"+n+" = " +r);
	}

	public static int div(int a, int b)
	{	
		int r = a/b;		
		return r;
	}

}
