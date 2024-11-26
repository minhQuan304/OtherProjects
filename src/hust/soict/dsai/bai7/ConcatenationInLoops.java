package hust.soict.dsai.bai7;

import static java.lang.System.currentTimeMillis;

import java.util.Random;

public class ConcatenationInLoops {
	public static void main(String[] args) {
		Random randomGenerator = new Random(123);

		long startTime = currentTimeMillis();
		String str = "";
		for (int i = 0; i < 65536; i++)
			str += randomGenerator.nextInt(2);
		System.out.println(currentTimeMillis() - startTime);

		randomGenerator = new Random(123);
		startTime = System.currentTimeMillis();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < 65536; i++)
			stringBuilder.append(randomGenerator.nextInt(2));
		str += stringBuilder.toString();
		System.out.println(System.currentTimeMillis() - startTime);
	}
}
