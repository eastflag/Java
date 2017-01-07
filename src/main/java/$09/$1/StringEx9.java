package $09.$1;


class StringEx9 {
	public static void main(String[] args) {
		String fullName = "Hello.java";

		// fullName에서 '.'의 위치를 찾는다.
		int index = fullName.indexOf('.'); //5

		// fullName의 첫번째 글자부터 '.'이 있는 곳까지 문자열을 추출한다.
		//0 <= fineName < 5
		String fileName = fullName.substring(0, index);

 	     // '.'의 다음 문자 부터 시작해서 문자열의 끝까지 추출한다.
		// fullName.substring(index+1, fullName.length());의 결과와 같다.
		String ext = fullName.substring(index+1);

		System.out.println(fullName + "의 확장자를 제외한 이름은 " + fileName);
		System.out.println(fullName + "의 확장자는 " + ext);
		
		String s = "lee dong kee";
		System.out.println(cutString(s));
	}
	
	public static String cutString(String s) {
		if(s.length() > 10) {
			return s.substring(0, 10) + "...";
		} else {
			return s;
		}
	}
}