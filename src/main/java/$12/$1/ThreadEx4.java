package $12.$1;
//12일차 1.6 싱글쓰레드 예제
class ThreadEx4 {
	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();
		for(int i=0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.print("소요시간1:" +(System.currentTimeMillis()- startTime)); 

		for(int i=0; i < 300; i++) {
			System.out.print("|");
		}

		System.out.print("소요시간2:"+(System.currentTimeMillis() - startTime));
	}
}