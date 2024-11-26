package hust.soict.dsai.bai7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
	public static void main(String[] args) throws IOException {
		String path = "C:/Users/DELL/eclipse-workspace/OtherProjects/src/test.txt";
		byte[] fileContent = { 0 };
		long startTimeMillis, endTimeMillis;

		try {
			fileContent = Files.readAllBytes(Paths.get(path));
		} catch (IOException e) {
			System.out.println("File not found: " + path);
			return;
		}

		startTimeMillis = System.currentTimeMillis();
		StringBuilder stringBuilder = new StringBuilder();
		for (byte byteData : fileContent) {
			stringBuilder.append((char) byteData);
		}
		endTimeMillis = System.currentTimeMillis();
		System.out.println("Execution time: " + (endTimeMillis - startTimeMillis) + " ms");
	}
}
