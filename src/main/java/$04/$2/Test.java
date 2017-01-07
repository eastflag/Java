package $04.$2;

public class Test {

	/**
	 * 반복문에 쓰이는 continue와 break 사용 예
	 * 1-20 까지중 2의 배수도 아니고 3의 배수도 아닌 수의 총합을 구하시오
	 * 
	 * 처음에 break문으로 오류 유발.
	 * 그 담에 break-point 설정하여 디버깅하여 continue를 사용해야 함으로 보여준다
	 */
	public static void main(String[] args) {
		
		String s = "yes";
		
		if(s == "yes"){
			System.out.println("yes " ); 
		}

		int sum = 0;
		
		for(int i=1; i<=20 ; i++){
			if(i%2 != 0 && i%3 != 0 ){
				sum += i;
			}
			
			//if(i%2==0 || i%3 == 0){
			//	continue;
			//}
			//sum += i;
		}
		
		System.out.println(" " + sum); //73

	}

}
