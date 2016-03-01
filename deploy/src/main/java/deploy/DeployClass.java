package deploy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DeployClass {

	public static void main(String[] args) {
		ReadFile("C:/TestWorkspace/testfile.txt");
	}
	
	public static void ReadFile(String filePath){
		try (Stream<String> inputStream = Files.lines(Paths.get(filePath))) {

			inputStream.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
