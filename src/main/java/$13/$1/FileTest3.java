/**
 * 4.
 * 디렉토리 생성, 삭제
 */
package $13.$1;

import java.io.File;

public class FileTest3 {

	public static void main(String[] args) {
		//1)디렉토리 생성하기
		File f = new File("d:\\aaa");
		if(!f.exists()){
			f.mkdir();
		}
		
		//2) 디렉토리 삭제하기
		File f2 = new File("d:\\aaa");
		if(f2.exists()){
			f2.delete();
		}

	}

}
