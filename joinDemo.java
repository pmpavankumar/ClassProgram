package MultiThread;

import sun.jvm.hotspot.runtime.Threads;

class Engagment extends Thread
{
	public void run()
	{
		for(int i=20;i<=30;i++)
		{
			
			System.out.println(Thread.currentThread().getName()+ " "+ i);

	}
	
}
class Marriage extends Thread
{
	public void run()
	{
		for(int i=20;i<=30;i++)
		{
			
			System.out.println(Thread.currentThread().getName()+ " "+ i);

	}
	
}

public class joinDemo {

	public static void main(String[] args) {
		Engagement engagement = new engagement();
		Marriage 
	}
	
	}

}
