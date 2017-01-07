package $A;

public class EnumTest {

	public static void main(String[] args){
		for(SignFlag f : SignFlag.values()){ //@1 SignFlag f : SignFlag.values()
			System.out.print(f + " : "); //@1 f
			System.out.print(f.name() + " : "); //@1 f.name()
			System.out.println(f.ordinal());  //@1 f.ordinal() 	
		}
	}
}

enum SignFlag {black, yellow, green, blue, red}; //@진 

/***
c:\javasrc\chap07>javac EnumMain.java
c:\javasrc\chap07>java EnumMain
black : black : 0
yellow : yellow : 1
green : green : 2
blue : blue : 3
red : red : 4
***/