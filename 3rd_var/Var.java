

public class Var{

	public static void main(String args[]){
		int a = 3;
		//float f = (float)3.14;
		float f = 3.14f;

		int i = 4;
		short s = 4;
		short s2 = (short)40000;

		//s = i; //casting eror
		//s = s+1; //error due precision maintaining, int + int
		s = (short)(s+1);
		s = (short)(s+s2);

		/* JAVA don't have pointer*/
		//int *p = malloc(10*sizeof(int));
		int p[] = new int[10];
		int p2[] = {1,2,3,4}; //static allocation

		//char str[100];
		char str[] = new char[100];

		//char str2[] = "abc";
		String str2 = "abc";

		//forcefully activate garbage collector
		p = null;
		p2 = null;
		str = null;
		str2 = null;
	}
}
