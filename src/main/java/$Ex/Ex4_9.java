package $Ex;

public class Ex4_9 {

	/**
	 * 문자열 str="12345" 일때 각각의 자리수를 합하여 1+2+3+4+5 를 더하여 15출력하기
	 */
	public static void main(String[] args) {
		
		String str = "12345";
		
		int sum = 0;
		
		for(int i=0; i<str.length() ; i++){
			int k = str.charAt(i) - '0';
			sum += k;
		}
		
		System.out.println(sum);

	}

}