/*
 * 3. 파일 inputstrea 예제 1
 * 한 바이트를 읽기 위해서는 매개변수 없는 read()를 사용하며, 
 * 여러 바이트를 읽기 위해서는 read(byte[] b)를 이용한다. 
 * read()의 경우 데이터를 읽는데 실패하면 -1을 리턴한다. 
 * 그렇지 않은 경우에는 해당 데이터를 int형으로 리턴하게 된다.
 */
package $13.$2;

import java.io.FileInputStream;
import java.io.IOException;

public class FileStreamTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("d:\\a.dat"); 
        int i;
        while( (i=fis.read()) != -1 ){ 
            System.out.print((char)i); 
        }
        fis.close();
	}

}
