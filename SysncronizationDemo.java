package MultiThread;
class Drink
{
	//synchronized public void drinktime(int time)
	 public void drinktime(int time)
	{
		for(int i=0;i<=time;i++)
		{
			System.out.println(Thread.currentThread().getName() + " is drinking water");
		}
		synchronized(this)
		{
			for(int i=0;i<=time;i++)
			{
				System.out.println(Thread.currentThread().getName() + " is drinking water");
			}
		}
	}
}
class WaterBottle extends Thread
{
	Drink d = new Drink();
	public void run()
	{
		d.drinktime(10);
	}
}

public class SysncronizationDemo {

	public static void main(String[] args) {
		
		WaterBottle w = new WaterBottle();
		
		Thread akshay = new Thread(w);
		Thread tanmy = new Thread(w);
		
		akshay.setName("akshay");
		tanmy.setName("tanmy");
		
		akshay.start();
		tanmy.start();
		
	

	}

}
