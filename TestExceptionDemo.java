import java.util.Scanner;

class Calculator{
	int num1;
	int num2;
	public Calculator(){}
	public Calculator(int num1, int num2){
		this.num1= num1;
		this.num2= num2;
	}
	public float divide(){
		float result=0.0f;
		try{
			result=num1/num2;
		  }
		//multiple catches
		catch(ArithmeticException | ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("\nPlease check the divisor should not be zero.\n");
		}
		
		
		
		/* catch(ArrayIndexOutOfBoundsException aex)
		{
			System.out.println("\nPlease check the array size.\n");
		}
		catch(Exception e)
		{
			System.out.println(" "+"Other Exceptions");
			e.printStackTrace();
		} */
		
		
		
		finally{
			System.out.println("The block is always executed.");
		}
		return result;
	}
	
}
public class TestExceptionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("************************************");
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		System.out.println("Enter num2: ");
		int num2=sc.nextInt();
		Calculator c=new Calculator(num1, num2);
		System.out.println("Division of 2 number: "+c.divide());
		System.out.println("************************************");
		
	}

}
