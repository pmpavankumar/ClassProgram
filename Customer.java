package interThread;

public class Customer {
	
	int balance = 0;
	int flag =0;
	
	public synchronized int withdraw(int amount) throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName() +"i am going");
		if(flag==0)
		{
			try
			{
				System.out.println("waiting...");
			
			wait();
		}catch(InterruptedException e)
			{
			e.printStackTrace();
			}
			balance -=amount;
		return amount;
	}

}
	
	
	public synchronized int deposite(int amount)
	{
		return amount
	}
