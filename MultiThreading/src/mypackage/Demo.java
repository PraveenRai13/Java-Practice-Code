package mypackage;
class MyThread extends Thread{
public void run() {
for(int i=0;i<10;i++) {
System.out.println("Child thread");
}
}
}
public class Demo{
public static void main(String[] args) {
MyThread t = new MyThread();
t.setPriority(10);
t.start(); 
for(int i=0;i<10;i++) {
System.out.println("Main thread");
}
}
}
