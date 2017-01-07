package $09.$1;

public class HashTest {

	public static void main(String[] args) {
		String str1 = "AAA";
		String str2 = "AAA";

		System.out.println("str1 hash:" + str1.hashCode());
		System.out.println("str2 hash:" + str2.hashCode());

		// 문자열이 달라도 해쉬값이 중복될수 있다.
		String a = "Z@S.ME";
		String b = "Z@RN.E";
		
		System.out.println("a hash:" + a.hashCode());
		System.out.println("b hash:" + b.hashCode());


	}

}
