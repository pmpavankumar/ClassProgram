package MultiThread;

class Aarti extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==2)
				try
			{
				Thread.sleep(1000);
			}catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		System.out.println("Aarti "+ i);
	}
}
}
class abhi extends Thread
{
	public void run()
	{
		for(int i=20;i<=30;i++)
		{
			if(i==2)
				try
			{
					Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ " "+ i);

	}
}
}
class abhay extends Thread
{
	public void run()
	{
		for(int i=30;i<=40;i++)
		{
			if(i==32)
				stop();
			System.out.println(Thread.currentThread().getName()+ " "+ i);
	}
}
}


public class Multitakingdemo {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());

	
		A o = new A();
		
		Aarti aarti = new Aarti();
		abhi Abhi = new abhi();
		abhay Abhay = new abhay();
		
		
		aarti.setName("aarti");
		Abhi.setName("abhi");
		Abhay.setName("abhay");
		
		//aarti.run();
		//Abhi.run();
		//Abhay.rum();
		o.start();
		
		
		aarti.start();
		Abhi.start();
		Abhay.start();
	}

}
