package $13.$4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest2 {
	 //BufferedFileCopy 프로그램의 실행
    //java BufferedFileCopy 원본파일이름 목표파일이름
    //예) java BufferedFileCopy s.exe t.exe
    //s.exe는 같은 디렉터리 상에 존재해야 한다.
    public static void main(String[] args) throws IOException{
        int i, len=0;
        FileInputStream fis = new FileInputStream( "d:\\a.html"); 
        FileOutputStream fos = new FileOutputStream( "d:\\bbb.html"); 
        BufferedInputStream bis = new BufferedInputStream(fis); 
        BufferedOutputStream bos = new BufferedOutputStream(fos); 
         
        long psecond = System.currentTimeMillis(); 
        while((i=bis.read()) != -1) { 
            bos.write(i); 
            len++;
        }
        bis.close();
        bos.close();
        psecond = System.currentTimeMillis() - psecond; 
        System.out.println(len + " bytes " + psecond +" miliseconds");
    } 
}
