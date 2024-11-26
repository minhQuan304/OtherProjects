package hust.soict.dsai.bai7;

import java.io.IOException;
import java.io.InputStream;

public class GarbageCreator {
	public static void main(String[] args) throws IOException {
		String fileName = "test.txt";
		byte[] byteData = { 0 };
		long startTimeMillis, endTimeMillis;

		try (InputStream inputStream = GarbageCreator.class.getClassLoader().getResourceAsStream(fileName)) {
			if (inputStream == null) {
				System.out.println("File not found: " + fileName);
				return;
			}
			byteData = inputStream.readAllBytes();
		}

		startTimeMillis = System.currentTimeMillis();
		StringBuilder stringBuilder = new StringBuilder();
		for (byte dataByte : byteData) {
			stringBuilder.append((char) dataByte);
		}
		endTimeMillis = System.currentTimeMillis();

		System.out.println("Execution time: " + (endTimeMillis - startTimeMillis) + " ms");
	}
}
