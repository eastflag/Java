package $13.$4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ByteToCharTest {
	//ByteToCharMain 프로그램의 실행
    //java ByteToCharMain 원본파일이름 목표파일이름
    //예) java ByteToCharMain ByteToCharMain.java tmp.txt
    public static void main (String[] args) throws IOException {
        FileInputStream fis = new FileInputStream ("d:\\a.txt"); 
        FileOutputStream fos = new FileOutputStream ("d:\\aaa.txt"); 
        InputStreamReader isr = new InputStreamReader (fis); 
        OutputStreamWriter osw = new OutputStreamWriter (fos); 
        int i;
        while((i=isr.read()) != -1){ 
            osw.write(i); 
        }
        osw.close();
        isr.close();
        System.out.println("작업완료");
    } 
}
