class Call implements Runnable
{
	String a;
	int x,time;
	Thread t;
	Call(String tn,int ti,int ex)
	{
		a=tn;
		x=ex;
		time=ti;
		t=new Thread(this,a);
		t.start();
	}
	public void run()
	{
		try{
			for(int i=0;i<x	;i++)
			{
				System.out.println(a);
				Thread.sleep(time);
			}
		    }
		catch(InterruptedException ie)
		{
			System.out.println("Inturrupted ");
		}
	}
}

class Thread1
{
public static void main(String xx[])
{
	new Call("BMS College of Enginnering",10000,2);
	new Call("CSE",2000,10);
}
}