package $09.$1;

//String을 primitive로 변환하는 예제
class StringEx8 {
	public static void main(String[] args) {
		String[] numbers = { "1", "2", "3", "4", "5" };
		String result1 = "";
		int result2 = 0;

		for(int i=0; i < numbers.length; i++) {
			result1 += numbers[i];
			result2 += Integer.parseInt(numbers[i]);
		}

		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		String fileName ="20140603/101511+00000N00O.AVI";
		
		String localName = fileName.substring(0, fileName.indexOf("+")) + fileName.substring(fileName.indexOf("."));
		System.out.println("localName : " + localName);
		localName = localName.replace("/", "_");
		localName = String.format("%s-%s-%s", localName.substring(0, 11), localName.substring(11, 13), localName.substring(13));
		System.out.println("localName : " + localName);
	}
}