package $Ex;

public class Ex4_6 {

	/**
	 * 두개의 주사위를 던져서 눈의 합이 6이 되는 경우의 수를 출력하라
	 */
	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++){
			for(int j=1; j <=6 ; j++){
				if(i+j == 6)
					System.out.println( i + " , " + j);
			}
		}

	}

}
