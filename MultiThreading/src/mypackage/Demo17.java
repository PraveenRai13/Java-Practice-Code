package mypackage;

import java.util.concurrent.locks.ReentrantLock;

class Display2{
	ReentrantLock l = new ReentrantLock();
public void wish(String name) {
l.lock();
for(int i=0;i<2;i++) {
System.out.println("Good Morning");
try {
Thread.sleep(1000);
}catch(InterruptedException e) {}
System.out.println(name);		
}
l.unlock();
}
}
class MyThread17 extends Thread{
Display2 d;
String name;
MyThread17(Display2 d2, String name){
this.d=d2;
this.name=name;
}
public void run()
{
d.wish(name);
}
}
public class Demo17 {
public static void main(String[] args) {
Display2 d = new Display2();
MyThread17 t1 = new MyThread17(d,"Dhoni");
MyThread17 t2 = new MyThread17(d,"Rohit");
t1.start();
t2.start();
}
}
