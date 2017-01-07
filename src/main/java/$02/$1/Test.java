package $02.$1;

public class Test {

	/**
	 * char 타입 int 변환 예제. 묵시적 형변환 가능
	 */
	public static void main(String[] args) {
		char ch = 'A';             // char ch = '\u0041';로 바꿔 써도 같다. 
        int code = (int)ch;       // ch에 저장된 값을 int형으로 변환하여 저장한다.
        System.out.println(ch); 
        System.out.println(code); 
        
        String a = "0.2";
        String b = "1.0.3";
        
        int intA = Integer.parseInt(a.replace(".", ""));
        int intB = Integer.parseInt(b.replace(".", ""));
        
        if ( intB > intA) 
        	System.out.println("true");
        else 
        	System.out.println("true");

	}

}
