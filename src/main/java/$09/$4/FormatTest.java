package $09.$4;

public class FormatTest {
	public static void main(String[] args) {
		//1. Formating의 예
		String s1 = String.format("%s  %d  %f  %o %h", "Hello", 100, 3.14F, 100, 100); //@진 

		//2. 숫자 포매팅의 예
		String s2 = String.format("%,d", 10000000); //@진 
		String s3 = String.format("%.3f", 42.000000); //@진 
		String s4 = String.format("%,.2f ", 12345.678901); //@진 

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		String strJson = String.format("{$HOME_ID$:$%s$,$DATA$:{$CMD$:$%s$}}", "GHD141115-001", "1");
		strJson = strJson.replaceAll("[$]", "\"");
		System.out.println(strJson);
	}
}
/***
c:\javasrc\chap07>javac StringFormattingMain.java
c:\javasrc\chap07>java StringFormattingMain
Hello  100  3.140000  144 64
10,000,000
42.000
12,345.68
***/