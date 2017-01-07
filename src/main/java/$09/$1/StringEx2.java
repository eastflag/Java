package $09.$1;
//우측 부분을 보면 알아볼 수 있는 글자들이 눈에 띨 것이다. 
//그 중에서도 "AAA"와 "BBB"가 있는 것을 발견할 수 있을 것이다. 
//이와 같이 String리터럴들은 컴파일 시에 클래스파일에 저장된다. 
//위의 예제를 실행하게 되면 "AAA"라는 문자열을 담고 있는 String인스턴스가 하나 생성된 후, 
//참조변수 s1, s2, s3는 모두 이 String인스턴스를 참조하게 된다. 

//모든 클래스 파일(*.class)에는 constant pool이라는 상수값 목록이 있어서, 
//여기에 클래스 내에서 사용되는 문자열 리터럴과 상수값들이 저장되어 있다. 
class StringEx2 {
	public static void main(String args[]) {
		String s1 = "AAA";
		String s2 = "AAA";
		String s3 = "AAA";
		String s4 = "BBB";
	}
}