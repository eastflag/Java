package $15_stream.$2_kind;

import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static int sum;

	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1,  100);
		stream.forEach(a -> sum += a);
		System.out.println("총합: " + sum);

		sum =0;
		//range: first <= x < second
		IntStream stream2 = IntStream.range(1, 100);
		stream2.forEach(a -> sum += a);
		System.out.println("총합2: " + sum);
	}
}
