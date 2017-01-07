package $A;

import java.nio.ByteBuffer;

public class ByteBufferTest {

	public static void main(String[] args) {
		ByteBuffer buf = ByteBuffer.allocate(480);
		buf.clear();
		
		byte[] outBuffer = new byte[320];
		for(int i=0; i<320; i++) {
			outBuffer[i] = (byte)i;
		}
		
		System.out.println("1 buf remaing:" + buf.remaining());
		
		buf.put(outBuffer);
		System.out.println("2 buf position:" + buf.position() );
		
		buf.flip(); //포지션을 write 하기전 위치로 이동시킴.
		System.out.println("3 buf position:" + buf.position() );
		
		byte[] block = new byte[120];
		
		buf.get(block);
		System.out.println("4 buf position:" + buf.position() ); //120
		
		buf.compact();
		System.out.println("5 buf position:" + buf.position() ); //200 컴팩트시 읽은 부분은 잘라내고 뒷부분이 앞으로 이동.
		//그러나 position은 write한 뒤로 이동하여 쓸수 있게 준비가 된다. read 할려면 다시 flip
		
		buf.flip();
		System.out.println("6 buf position:" + buf.position() ); //200
		
		System.out.println("byte.get():" + buf.get(0)  );
		
		buf.put(outBuffer, 10, 10);		
		
		//System.out.println("byte.get():" + buf.get(200)  );
		
	}

}
