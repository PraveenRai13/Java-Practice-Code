package mypackage;

class MyThread01 extends Thread{}
public class Demo01 {
public static void main(String[] args) {
System.out.println(Thread.currentThread().getName());
MyThread01 t = new MyThread01();
System.out.println(t.getName());
Thread.currentThread().setName("Praveen");
System.out.println(Thread.currentThread().getName());
System.out.println(10/0);
}
}
