package mypackage;
class Display1{
	public void wish(String name) {
		for(int i=0;i<10;i++) {
			System.out.println("Good Morning");
			synchronized (this) {
				
			
			try {
			Thread.sleep(2000);
			}catch(InterruptedException e) {}
			System.out.println(name);		
			}		
	}
	}
}
class MyThread10 extends Thread{
	Display d;
	String name;
	MyThread10(Display d, String name){
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
public class Demo10 {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread10 t1 = new MyThread10(d,"Praveen");
		MyThread10 t2 = new MyThread10(d,"Pranav");
		t1.start();
		t2.start();

	}

}
