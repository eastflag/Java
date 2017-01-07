/* 2. 
 * File 클래스는 파일 및 디렉터리를 관리할 수 있는 기능을 제공하는 클래스이다. 
 * 이 클래스를 이용하면 특정 파일의 존재유무 확인, 복사, 이름변경 등 파일에 관련된 작업을 할 수 있다. 
 * 하지만 한가지 유의할 점은 File 클래스 자체에서는 파일의 데이터를 입출력하기 위한 메서드는 제공해주지 
 * 않는다는 것이다. 자바에서는 모든 데이터의 입출력을 스트림 기반으로 수행하기 때문에 File 클래스 
 * 내에는 입출력을 위한 메서드는 제공하지 않고 있다.
 */
package $13.$1;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class FileTest1 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\workspace\\android\\13-1\\src\\$1\\FileTest1.java"); //@진 
		PrintStream out = System.out; //@진 
		out.println("isFile(): " + f.isFile()); //파일인지 아닌지 //@1 f.isFile()
		out.println("isDirectory(): " + f.isDirectory()); //디렉터리인지 아닌지 //@1 f.isDirectory()
		out.println("isHidden(): " + f.isHidden()); //숨김파일인지 //@1 f.isHidden()
		out.println("lastModified(): " + f.lastModified()); //마지막에 수정된 날짜 //@1 f.lastModified()
		out.println("canRead(): " + f.canRead()); //읽기 속성을 가진 파일인지 //@1 f.canRead()
		out.println("canWrite(): " + f.canWrite()); //쓰기 속성을 가진 파일인지 //@1 f.canWrite()
		out.println("getPath(): " + f.getPath()); //상대 경로  //@1 f.getPath()
		out.println("getAbsolutePath(): "+ f.getAbsolutePath()); //절대 경로 //@1 f.getAbsolutePath()
		out.println("getName(): " + f.getName()); //디렉터리 또는 파일의 이름 //@1 f.getName()
		out.println("toURL(): " + f.toURL()); //URL형식의 경로 //@2 toURL()
		out.println("exists(): " + f.exists()); //파일이 존재하는지 //@1 f.exists()
		out.println("length(): " + f.length()); //파일의 길이 //@1 f.length()

	}

}
