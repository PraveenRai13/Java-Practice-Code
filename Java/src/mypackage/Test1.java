package mypackage;

class Test1 extends Test{
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		Test1 t1 = new Test1();
		t1.m1();
		Test t2 = new Test1();
		t2.m1();

	}

}
