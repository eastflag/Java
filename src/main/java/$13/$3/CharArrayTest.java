package $13.$3;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayTest {
	public static void main(String[] args) throws IOException {
        int ch;
        char[] arr = {'j','a','b','o','o','k'}; 
        CharArrayReader car = new CharArrayReader(arr); 
        CharArrayWriter caw = new CharArrayWriter(); 
        while((ch=car.read()) != -1) { 
            caw.write(ch); 
        }
        String str = caw.toString(); 
        System.out.println(str); //jabook 출력
        //결과출력
        char[] result = caw.toCharArray(); 
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]); //jabook 출력
        }
        car.close();
        caw.close();
    } 
}
