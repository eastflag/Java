package $02.$1;

public class ConvertBinary {

    /**
     * @param args
     * @author 	dongkee.lee(dongkee.lee@lge.com)
     * @date		2013. 9. 25.
     */
    public static void main(String[] args) {
        String s1 = "011111";
        String s2 = "111011";
        
        int i1 = Integer.parseInt(s1, 2);
        int i2 = Integer.parseInt(s2, 2);
        
        int i = i1&i2;
        
        System.out.println("i:" + i);
        System.out.println("i:" + Integer.toBinaryString(i));
        
        if( (i & 0x01) > 0) 
            System.out.println("1번째 비트 on");
        
        if( (i & 0x02) > 0) 
            System.out.println("2번째 비트 on");
        
        if( (i & 0x04) > 0) 
            System.out.println("3번째 비트 on");
        
        if( (i & 0x08) > 0) 
            System.out.println("4번째 비트 on");
        
        if( (i & 0x10) > 0) 
            System.out.println("5번째 비트 on");
    }

}
