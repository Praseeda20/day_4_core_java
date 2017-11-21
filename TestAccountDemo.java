import java.util.Scanner;


public class TestAccountDemo {
	public static void main(String[] args)
	{
		int currentBalance=500000;
		try(Scanner sc=new Scanner(System.in))
		{	
		System.out.println("Enter Withdraw amount: ");
		int withdrawAmt=sc.nextInt();
		
		if(withdrawAmt>currentBalance)
		{
			try 
			{
				throw new LowBalanceException("Insufficient balance in your account.");
			} 
			catch (LowBalanceException e) 
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("You have sufficient balance. You can withdraw the money");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}}
