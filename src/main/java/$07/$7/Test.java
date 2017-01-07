package $07.$7;

public class Test {

	//7.7.7 인터페이스를 이용한 다형성
	public static void main(String[] args) {
		Parseable p1 = ParserManager.getParser("XML");
		p1.parse("a.xml");
		Parseable p2 = ParserManager.getParser("HTML");
		p2.parse("a.html");
	}

}

class ParserManager { 
	// 리턴타입이 Parseable인터페이스이다. => Parseable을 구현한 인스턴스 혹은 null
    public static Parseable getParser(String type) {       
          if(type.equals("XML")) { 
             return new XMLParser(); 
          } else { 
             Parseable p = new HTMLParser(); 
             return p; 
             // return new HTMLParser();       위의 두 줄을 간단히 할 수 있다. 
          } 
    } 
}

interface Parseable { 
    public abstract void parse(String fileName);       // 구문 분석작업을 수행한다. 
} 

class XMLParser implements Parseable { 
    public void parse(String fileName) { 
        /* 구문 분석작업을 수행하는 코드를 적는다. */ 
          System.out.println(fileName + " - XML parsing completed."); 
    } 
} 

class HTMLParser implements Parseable { 
    public void parse(String fileName) { 
        /* 구문 분석작업을 수행하는 코드를 적는다. */ 
          System.out.println(fileName + " - HTML parsing completed."); 
    } 
} 