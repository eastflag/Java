/**
 * 2.
 * 바이트 단위의 출력 스트림 
 * write(byte[] b), 
 * FileOutputStream(화일명, true), 
 * =>화일존재시 false : 오버라이트
 *   true : 덧붙이기
 */
package $13.$2;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest2 {

	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("d:\\a.dat", true); 
        byte[] b = new byte[]{72, 101, 108, 108, 111}; 
        fos.write(b); 
        fos.close();
        System.out.println("a.dat 파일 덧붙이기 기록완료");

	}

}
