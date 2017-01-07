package $08.$2;
public class Test {
	//method1이 예외처리
	/*
	public static void main(String[] args) {
		method1();
	}

	private static void method1(){
		try {
			throw new Exception("고의로 발생");
		} catch (Exception e) {
			System.out.println("method1에서 에러발생");
		}
	}
	*/
	
	//main이 예외처리
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void method1() throws Exception{
		throw new Exception("고의로 발생");
	}
}
