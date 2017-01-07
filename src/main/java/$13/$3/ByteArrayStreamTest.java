package $13.$3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayStreamTest {
	public static void main(String[] args) throws IOException{
		 int i;
	     byte[] arr = {'j', 'a', 'b', 'o', 'o', 'k'}; 
	     //1. ByteArray 스트림 생성
	     ByteArrayInputStream in = new ByteArrayInputStream(arr); 
	     ByteArrayOutputStream out = new ByteArrayOutputStream(); 
	     //2. ByteArrayInputStream에서 읽고 ByteArrayOutputStream에 기록
	     while((i=in.read()) != -1) { 
	         out.write(i); 
	     }
	     //3. ByteArrayOutputStream으로부터 바이트 배열 얻기
	     byte[] result = out.toByteArray(); 
	     for(i=0; i<result.length; i++){
	         System.out.print((char)result[i]);
	         //System.out.print(result[i]);
	     }
	     in.close();
	     out.close();
	}
}
