package mypackage;
class MyThread2 extends Thread{}
public class Demo02 {
public static void main(String[] args) {
System.out.println(Thread.currentThread().getPriority());
Thread.currentThread().setPriority(7);
MyThread2 t = new MyThread2();
System.out.println(t.getPriority());
}
}
