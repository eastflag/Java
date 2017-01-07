package $07.$1;

public class PointTest {
	
	public static void main(String[] args) {
		//1. 아래에서 일어나는 일들을 쓰시오.
		// new 연산자에서 메모리 할당방법 : 자신과 부모를 모두 포함. x, y, z 가 모두 포함
		// 생성자 호출순서를 자세히: 자신과 부모를 모두 포함
		point3D pd = new point3D();
		System.out.println("x:" + pd.x + "y:"+pd.y + "z:" + pd.z);
		
		//2. point의 getLocation()을 이용해서 출력
		//3. point3D 에서 오버라이딩을 이용해서 출력 (F3 , Alt-왼쪽화살표)
		//4. 변수 3개를 받아서 초기화하는 생성자 추가하고 흐름을 서술하시오.
	}

}

class point {
	int x;
	int y;
	String getLocation(){
		return "x:" + x + "y:" + y;
	}
}

class point3D extends point{
	int z;
}

