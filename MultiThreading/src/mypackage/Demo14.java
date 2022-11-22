package mypackage;
class MyThread14 extends Thread{
MyThread14(ThreadGroup g,String name){
super(g,name);
}
public void run() {
System.out.println("Child thread");
try {
Thread.sleep(5000);
}catch(InterruptedException e) {}
}
}
public class Demo14 {
public static void main(String[] args) throws InterruptedException {
ThreadGroup pg = new ThreadGroup("Parent Group");
ThreadGroup cg = new ThreadGroup(pg,"Child Group");
MyThread14 t1 = new MyThread14(pg, "Child Group1");
MyThread14 t2 = new MyThread14(pg, "Child Group2");
t1.start();
t2.start();
System.out.println(pg.activeCount());
System.out.println(pg.activeGroupCount());
pg.list();
Thread.sleep(10000);
System.out.println(pg.activeCount());
System.out.println(pg.activeGroupCount());
pg.list();
}
}
