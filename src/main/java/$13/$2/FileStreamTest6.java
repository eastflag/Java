package $13.$2;

import java.io.FileWriter;
import java.io.IOException;

public class FileStreamTest6 {

	public static void main(String[] args) throws IOException{
		//문자단위 핸들링
		FileWriter fos = new FileWriter("d:\\writer.dat"); 
        fos.write(72);
        fos.write(101);
        fos.write(108);
        fos.write(108);
        fos.write(111);
        fos.close();
        System.out.println("writer.dat 파일 기록 완료");
	}
}
