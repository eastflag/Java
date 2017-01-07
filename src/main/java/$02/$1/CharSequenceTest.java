package $02.$1;

public class CharSequenceTest {
	public static void main(String [] args){
		String str ="다 된밥에 재 뿌리기";
		CharSequence s ="다 된밥에 재 뿌리기";
		System.out.println( str.length() + "," + s.length()  );
		System.out.println( str.charAt(0) + "," + s.charAt(0) );
		System.out.println(s.toString());
		
	}
}
