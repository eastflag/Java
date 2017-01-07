/**
 * 5.
 * 화일이름 바꾸기
 */
package $13.$1;

import java.io.File;

public class FileTest4 {

	public static void main(String[] args) {
		File f = new File("FileTest4.class"); 
        File t = new File("FileRenameMain_backup.class"); 
        if(f.exists()){ 
            f.renameTo(t); 
            System.out.println("이름바꾸기 완료");
            System.out.print("FileRenameMain.class->");
            System.out.println("FileRenameMain_backup.class");
        }

	}

}
