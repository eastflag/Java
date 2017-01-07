package $09.$1;

public class SplitTest {

	public static void main(String[] args) {
		String s1 = "aaa/bbb/ccc";
		String s[] = s1.split("/");
		System.out.println(s[0]);

		String [] sub_device = "1".split("\\:"); //"1:2:3"
		
		for(String key : sub_device) {
			System.out.println(key);
		}
	}

}
