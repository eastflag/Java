package $03.$1;
public class Test {

	/**
	 * 연산예제
	 */
	public static void main(String[] args) {
		System.out.println("이항 연산자, int보다 크기가 작은 타입은 int로 변환-----------------------"); 
		byte a = 10; 
        byte b = 20; 
        //byte c = a + b;  
        byte c = (byte)(a+b);
        System.out.println(c); 
        
        System.out.println("산술은 앞에서부터 차례로 계산, =만 뒤에서 앞으로 계산-----------------------");
        int a2 = 1000000 * 100000 / 1000000;
        int b2 = 1000000 / 100000 * 1000000;
        System.out.println(a2); //overflow 발생 => 
        System.out.println(b2); 
    
        System.out.println("비교연산자-----------------------");
        if('A' < 'B') {
        	System.out.println("'A < 'B' : true "); 
        }
        
        System.out.println(" " +  6/5);

	}

}