package mypackage;
class MyThread5 extends Thread{
static Thread mt;
public void run() {
try {
mt.join();
}catch(InterruptedException e) {}
for(int i =0;i<10;i++) {
System.out.println("Child Thread");
}
}
}
public class Demo05 {
public static void main(String[] args) {
MyThread5.mt = Thread.currentThread();
MyThread5 t = new MyThread5();
t.start();
for(int i =0;i<10;i++) {
System.out.println("Main Thread");
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
}
}
}
}
