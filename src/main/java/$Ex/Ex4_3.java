package $Ex;

public class Ex4_3 {

	/**
	 * 1 + (1+2) + ... (1+2+3...10) 구하기
	 */
	public static void main(String[] args) {
		
		int result = 0;
		int sum = 0;
		
		for(int i = 1 ; i <= 10 ; i++){
			sum += i;
			result += sum;
		}
		
		System.out.println("result: " + result); //220

	}

}
