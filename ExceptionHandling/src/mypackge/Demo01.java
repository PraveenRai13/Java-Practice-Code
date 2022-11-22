package mypackge;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo01 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.print("Hello");
	}

}

