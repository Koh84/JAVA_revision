//java Div 6 2
//6/2 = 3

public class Div4{

	public static void main(String argv[])
	{
		int m = Integer.parseInt(argv[0]);
		int n = Integer.parseInt(argv[1]);
		
		int r = 0;
		System.out.println("Beginning of DIV");

		try{
			r = div(m,n);
		}catch (ArithmeticException e)
		{
			System.out.println(e);
		}

		System.out.println("End of DIV");
		System.out.println(m+"/"+n+" = " +r);
	}

	public static int div(int a, int b) throws ArithmeticException
	{	
		int r = 0;
		r = a/b;			
		return r;
		
	}

}
