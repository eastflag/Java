package $02.$2;

public class Test {

	/**
	 * int 타입을 char 타입으로 형변환 예제, 명시적 형변환
	 */
	public static void main(String[] args) {
		int code = 65;    // 또는 int code = 0x0041; 
        char ch = (char)code; 

        System.out.println(code); 
        System.out.println(ch); 

	}

}
