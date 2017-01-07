package $06.$3;

public class CallStackTest {

	public static void main(String[] args) { 
	    System.out.println("main(String[] args)이 시작되었음."); 
	    firstMethod(); 
	    System.out.println("main(String[] args)이 끝났음."); 
	} 
	static void firstMethod() { 
		System.out.println("firstMethod()이 시작되었음."); 
		secondMethod(); 
		System.out.println("firstMethod()이 끝났음.");             
	} 
	
	static void secondMethod() { 
		int se = 0; //로컬변수. 스택에 저장되었다가 함수 종료와 함께 사라짐
		System.out.println("secondMethod()이 시작되었음."); 
		System.out.println("secondMethod()이 끝났음.");             
	} 

}
