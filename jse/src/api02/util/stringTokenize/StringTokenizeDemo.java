package api02.util.stringTokenize;

import java.util.StringTokenizer;

public class StringTokenizeDemo {
	public static void main(String[] args) {
		StringTokenizer tok = new StringTokenizer("Hello Java");
		while (tok.hasMoreTokens()) {
			Object token =  tok.nextToken();
			System.out.print("\t"+token);
			
		}
	}
	
}
