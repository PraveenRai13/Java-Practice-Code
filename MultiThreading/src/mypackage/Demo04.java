package mypackage;
class MyThread4 extends Thread{
public void run() {
for(int i=0;i<10;i++) {
System.out.println("Praveen Thread");
try {
Thread.sleep(2000);
}catch(InterruptedException e) {}
}
}
}
public class Demo04 {
public static void main(String[] args) {
MyThread4 t = new MyThread4();
t.start();
try {
t.join();
} catch (InterruptedException e) {
}
for(int i=0;i<10;i++) {
System.out.println("Prav Thread");
}
}
}
