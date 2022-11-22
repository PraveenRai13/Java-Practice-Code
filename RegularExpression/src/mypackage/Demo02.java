package mypackage;

import java.util.regex.Pattern;

public class Demo02 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\s");
		String[] s = p.split("Praveen Kumar Rai");
		for(String s1:s) {
			System.out.println(s1);
		}
	}

}
