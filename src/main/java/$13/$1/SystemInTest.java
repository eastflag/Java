/*
 * 1. 표준 읽기 예제
 */
package $13.$1;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) throws IOException{
		//한문자 읽기, 
		//엔터는 \r\n으로 13은 \r 이다.
		System.out.print("엔터를 누르세요");
        int i = System.in.read(); 
        System.out.println(i);
        
        /*
        //두문자 읽기, 
  		//엔터는 \r\n으로 13은 \r 이다.
  		System.out.print("엔터를 누르세요");
        int i2 = System.in.read(); 
        System.out.println(i2);
        i2 = System.in.read(); 
        System.out.println(i2);
		
		//한라인 읽기
		System.out.print("문자를 입력한 후 엔터를 누르세요? ");
		int i3;
		while( (i3=System.in.read()) != '\n' ){ //@1 (i=System.in.read()) != '\n'
			System.out.println((char)i3 +":" + i3);
		}
		*/
	}

}
