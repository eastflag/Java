package $06.$6;
class StaticBlockTest { 
      static int[] arr = new int[10]; 

      static { 
            for(int i=0;i < arr.length;i++) { 
                  // 1과 10사이의 임의의 값을 얻어서 배열 arr에 저장한다. 
                  arr[i] = (int)(Math.random()*10) + 1; 
            } 
      } // 클래스 초기화블럭의 끝.

      public static void main(String args[]) { 
            for(int i=0; i< arr.length;i++) 
                  System.out.println("arr["+i+"] :" + arr[i]); 
      } 
} 
