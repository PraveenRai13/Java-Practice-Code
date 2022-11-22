package mypackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo01 {

	public static void main(String[] args) {
		//Pattern p = Pattern.compile("[^0-9a-z]");
		//Pattern p = Pattern.compile("\\d");
		Pattern p = Pattern.compile("a*");
		//Matcher m = p.matcher("a36#k@9z");
		Matcher m = p.matcher("abaabaaab");
		while(m.find()) {
			System.out.println(m.start()+"....."+m.group());
		}
	}

}
