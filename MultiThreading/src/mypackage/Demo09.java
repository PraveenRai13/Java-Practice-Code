package mypackage;
class Display{
	public synchronized void wish(String name) {
		for(int i=0;i<10;i++) {
			System.out.println("Good Morning");
			try {
			Thread.sleep(2000);
			}catch(InterruptedException e) {}
			System.out.println(name);		
			}		
	}
}
class MyThread09 extends Thread{
	Display d;
	String name;
	MyThread09(Display d, String name){
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
public class Demo09 {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread09 t1 = new MyThread09(d,"Praveen");
		MyThread09 t2 = new MyThread09(d,"Pranav");
		t1.start();
		t2.start();
		
	}

}
