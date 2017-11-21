import java.io.IOException;


public class ThrowDemo{
	public void method1()  throws IOException
	{
		System.out.println("I am in method 1.");
		method2();
	}
	
	public void method2() throws IOException
	{
		System.out.println("I am in method 2.");	
			throw new IOException();	
			

	}
}
