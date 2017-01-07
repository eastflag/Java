package $02.$3;
public class Test {

	/**
	 * 문자열 테스트
	 * 형변환 테스트
	 */
	public static void main(String[] args) {
		//문자와 문자열
		//char a = 'AA';
		//char b = '';
		System.out.println(7 + 7 + "7"); 
		System.out.println("7" + 7 + 7); 
		
		 //형변환
		 double d = 100.0;  //100.0d 가 디폴트이므로 float d는 오류
         int i = 100;   //정수가 디폴트
         int result = i + (int)d;  //(int) 있을때와 없을때 비교

         System.out.println("d=" + d); 
         System.out.println("i=" + i); 
         System.out.println("result=" + result); 
         
         //명시적 형변환, overflow
         int i2 = 300;
         byte b = (byte)i2;
         System.out.println("b=" + b); //300 -> 44
         
         //형변환 생략 가능
         char ch = 'A';             // char ch = '\u0041';로 바꿔 써도 같다. 
         int code = ch;  // byte => int 형변환은 생략 가능
         
         //실습
         //int 최대값 구하기?
         int i3 = (int)(Math.pow(2, 31) - 1);
         System.out.println("int 최대값=" + i3);
         //i3 = 2147483648;
         
         System.out.println("문자코드 A~Z 찍어보기----------------------------");
         char c1 = 'A'; 
         for(int j=0; j<26; j++) {                // 블럭{} 안의 문장을 26번을 반복한다. 
        	 System.out.print("숫자코드: " +  (int)(c1) + "   ");    //'A'부터 26개의 문자를 출력한다. 
        	 System.out.print("문자코드: " +  (c1++) );
        	 System.out.println();  //한줄띄기
         } 

         System.out.println(); 
	}

}