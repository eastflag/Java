package $07.$8;

public class Test {

	//7.7.8 인터페이스의 이해
	public static void main(String[] args) {
		
		/*
		//1.2
		UserDAO dao = new UserDAO();
		dao.connect();
		//MySql에서 Oracle로 변경시 UserDAO 클래스를 변경해야 함.
		//만일 DAO 클래스가 수십개로 많을 경우 유지보수에 문제가 발생함
		*/
		
		//2.2 팩토리(컨테이너)에서 DB 인터페이스를 구현한 인스턴스를 생성해서 주입
		UserDAO dao = new UserDAO();
		MySql mysql = new MySql();
		dao.setDB(mysql);
		dao.connectDB();
		
		Oracle oracle = new Oracle();
		dao.setDB(oracle);
		dao.connectDB();
	}

}

/*
//1.1 A클래스에서 B의 클래스 사용. A(사용자) -> B(제공자) 의존 관계 성립
class UserDAO { 
	MySql mysql = new MySql();
	//Oracle oracle = new Oracle();
	void connect(){
		mysql.connect();
	}
} 

class MySql {
	public void connect() { 
		System.out.println("MySql connect"); 
	} 
}

class Oracle {
	public void connect() { 
		System.out.println("Oracle connect"); 
	} 
}
*/

//2.1 객체모델링
class UserDAO { 
	private DB db;
	void setDB(DB db){
		this.db = db;
	}
	void connectDB(){
		db.connect();
	}
} 

//추상화: mysql이든 oracle이든 연결한다라는 공통된 부분을 추상화
interface DB {
	void connect();
}

class MySql implements DB {
	public void connect() { 
		System.out.println("MySql connect"); 
	} 
}

class Oracle implements DB {
	public void connect() { 
		System.out.println("Oracle connect"); 
	} 
}

