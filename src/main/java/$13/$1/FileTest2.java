/*
 * 3. 파일 디렉토리 다루기, 디렉토리내의 파일 리스트 다루기
 */
package $13.$1;

import java.io.File;

public class FileTest2 {

	public static void main(String[] args) {
		//상대 경로로 디렉토리를 파일객체로 생성
		File f = new File(".");
		System.out.println("absolute path:" + f.getAbsolutePath());
		System.out.println("path:" + f.getPath());

		//디렉토리에 존재하는 화일 리스트 얻기
		File[] files = f.listFiles();
		for( File file : files){
			System.out.println("현재 경로에 존재하는 화일들:" + file.getName());
		}
	}

}
