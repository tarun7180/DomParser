package example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import example.model.Student;
import example.service.StudentManager;

public class CSVReader {

	public static void main(String[] args) {
		ReadCSVFile("C:\\TestWorkspace\\student.csv");
	}

	@SuppressWarnings("resource")
	public static void ReadCSVFile(String filePath){
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"spring.xml");
		try (Stream<String> inputStream = Files.lines(Paths.get(filePath))) {
			Iterator<String> streamItr = inputStream.iterator();
			List<String[]> studentList = new ArrayList<String[]>();
			while(streamItr.hasNext()){
					String[] studentData = streamItr.next().split(",");
					studentList.add(studentData);
			}
			StudentManager studentManager = (StudentManager) appContext.getBean("studentManagerImpl");
			for(int i=1;i<studentList.size();i++){
				String[] studentData = studentList.get(i);
				Student student = new Student();
				long studentRollNum = Long.valueOf(studentData[0]);
				student.setRollNumber(studentRollNum);
				student.setStudentName(studentData[1]);
				studentManager.updateStudent(student);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
