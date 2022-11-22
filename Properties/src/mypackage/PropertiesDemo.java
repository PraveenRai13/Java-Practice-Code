package mypackage;

import java.util.*;
import java.io.*;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("abc.properties");
		p.load(fis);
		System.out.println(p);
		String s = p.getProperty("Praveen");
		System.out.println(s);
		p.setProperty("pranav", "546786");
		FileOutputStream fos = new FileOutputStream("abc.properties");
		p.store(fos, "update by Praveen Rai");
	}

}
