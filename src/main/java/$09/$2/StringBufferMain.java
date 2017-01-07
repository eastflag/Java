package $09.$2;

/**
StringBuffer 클래스의 사용
**/
public class StringBufferMain{
	public static void main(String[] args){
		//1. String 클래스는 수정이 불가능한(Immutable) 클래스이다.
		String str1 = "www."; //@진 
		String str2 = "jabook."; //@진 
		String str3 = "org"; //@진 
		String str4 = str1 + str2 + str3; //@진
		System.out.println(str4);
		
		String str5 = str4.replace("org", "net"); //@진
		System.out.println(str5);
		System.out.println(str4.hashCode()); //주소가 바뀜을 확인
		System.out.println(str5.hashCode()); //주소가 바뀜을 확인

		//2. StringBuffer 클래스는 수정이 가능한 클래스이다.
		StringBuffer sb = new StringBuffer(); //@진 
		System.out.println(sb.hashCode());  //주소가 바뀌지 않음을 확인
		sb.append("www."); //@1 sb.append
		sb.append("jabook."); //@1 sb.append
		sb.append("org"); //@1 sb.append
		sb.replace(11, 14, "net"); //@1 sb.replace
		System.out.println(sb.hashCode());
		String str = sb.toString(); //주소가 바뀌지 않음을 확인
		System.out.println(str);
	}
}
