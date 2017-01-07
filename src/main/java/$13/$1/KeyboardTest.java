package $13.$1;
import java.util.Scanner;


public class KeyboardTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("이름 : ");
		String name=keyboard.nextLine();
		
		System.out.println(name);

	}

}
