package $13.$4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest1 {
	//FileCopy 프로그램의 실행
    //java FileCopy 원본파일이름 목표파일이름
    //예) java FileCopy s.exe t.exe
    //s.exe는 같은 디렉터리 상에 존재해야 한다.
    public static void main(String[] args) throws IOException{
        int i, len=0;
        FileInputStream fis = new FileInputStream("d:\\a.html"); 
        FileOutputStream fos = new FileOutputStream("d:\\aaa.html"); 
        long psecond = System.currentTimeMillis(); 
        while((i=fis.read()) != -1) { 
            fos.write(i); 
            len++;
        }
        fis.close();
        fos.close();
        psecond = System.currentTimeMillis() - psecond; 
         
        System.out.println(len + " bytes " + psecond +"  miliseconds");
    } 
}
