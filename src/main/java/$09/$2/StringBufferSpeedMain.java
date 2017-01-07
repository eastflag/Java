package $09.$2;

/**
String과 StringBuffer의 속도차
**/
public class StringBufferSpeedMain{
	public static void main(String[] args) {
		long startTime = 0L;
		long elapsedTime = 0L;

		//1. String으로 문자열 만들기의 속도 측정
		String str1 = ""; //@진 
		startTime = System.currentTimeMillis(); //@진 
		for(int i=0; i<50000; i++){
			str1 += "H"; //새로운 문자열 생성하기 //@1 str1 += "H"; 
		}
		elapsedTime = System.currentTimeMillis() - startTime; //@진 
		System.out.println("String 문자열만들기:" + elapsedTime);

		//2. StringBuffer로 문자열 만들기의 속도 측정
		StringBuffer sb = new StringBuffer(); //@진 
		startTime = System.currentTimeMillis(); //@진 
		for(int i=0; i<50000; i++){
			sb.append("H"); //새로운 문자열 추가하기 //@1 sb.append("H");
		}
		elapsedTime = System.currentTimeMillis() - startTime; //@진 
		System.out.println("StringBuffer 문자열만들기:" + elapsedTime);
	}
}
/***
c:\javasrc\chap07>javac StringBufferSpeedMain.java
c:\javasrc\chap07>java StringBufferSpeedMain
String 문자열만들기:11469
StringBuffer 문자열만들기:15

[참고] 속도측정 환경 : Pentium4 CPU 3.0GHz 1GB RAM
***/