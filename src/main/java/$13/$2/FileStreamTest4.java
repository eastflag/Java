package $13.$2;

import java.io.FileInputStream;
import java.io.IOException;

public class FileStreamTest4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("d:\\a.dat"); 
        int count;
        byte[] b = new byte[4]; 
        while( (count=fis.read(b)) != -1 ){ 
            for(int i=0; i<count; i++){
                System.out.print((char)b[i]); 
            }
        }
        fis.close();

	}

}
