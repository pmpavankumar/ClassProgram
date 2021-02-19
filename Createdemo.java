package MultiThread;


class A extends Thread
{
	public void run()
	{
	System.out.println("Hello this is my task i am oin riun method");

	}
}
class B implements Runnable
{
	public void run()
	{
		System.out.println("this is my implement");
		System.out.println("Hello this is my task i am oin riun method");

	}
}
public class Createdemo {

	public static void main(String[] args) {
		A o = new A();
		//o.run();
	    o.start();
	    
	    B o1 = new B();
	    Thread t1 = new  Thread(o1);
	    t1.start();
	

	}

}
