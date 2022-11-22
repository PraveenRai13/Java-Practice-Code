package mypackge;

	public class Demo02 {
	
		public static void main(String[] args) {
			System.out.println("Statement1");
			try {
				System.out.println(10/0);
			}catch(ArithmeticException e) {
				System.out.println(10/2);
			}
			System.out.println("Statement3");
		}
	
	}
