//java Div 6 2
//6/2 = 3

public class Div11{

	public static void main(String argv[])
	{
		int m = 0; 
		int n = 0; 
		int r = 0;

		System.out.println("Beginning of DIV");

		try{
			m = Integer.parseInt(argv[0]);
			n = Integer.parseInt(argv[1]);
			r = div(m,n);
		}catch (ArithmeticException e)
		{
			System.out.println("main : " + e);
		}
		catch (NumberFormatException e)
		{	
			System.out.println("div : " +e);
		}
		catch (RuntimeException e)
		{	
			System.out.println("div : " +e);
		}
		catch (Exception e)
		{	
			System.out.println("div : " +e);
		}

		System.out.println("End of DIV");
		System.out.println(m+"/"+n+" = " +r);
	}

	//public static int div(int a, int b) throws ArithmeticException
	public static int div(int a, int b) 
	{	
		int r = 0;
		try
		{
			r = a/b;			
		}
		catch (ArithmeticException e)
		{	
			System.out.println("div : " +e);
			try{
				throw new Exception("My Error");
			}
			catch(Exception e1){
				System.out.println("Catch error");
			}
		}finally
		{
			System.out.println("Finally div");
			//return r; //Wrong this will stop main method exception malfunction
		}
		return r;
		
	}

}
