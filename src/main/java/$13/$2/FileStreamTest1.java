/**
 * 1.
 * 바이트 단위의 출력 스트림 1.
 * write(int b)
 */
package $13.$2;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest1 {

	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("d:\\a.dat"); 
        fos.write(72); 
        fos.write(101); 
        fos.write(108); 
        fos.write(108); 
        fos.write(111); 
        fos.close();
        System.out.println("a.dat 파일 기록완료");
	}

}
