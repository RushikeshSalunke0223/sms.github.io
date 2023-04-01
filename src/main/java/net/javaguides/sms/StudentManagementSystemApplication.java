package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@SuppressWarnings("unused")
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1=new Student("Rushikesh" ,"Salunke","rushisalunke006@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2=new Student("Shubham" ,"Beldar","shubhaBeldar2000@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3=new Student("Siddhant" ,"Mhandhare","SiddhantMandhare1999@gmail.com");
//		studentRepository.save(student3);
	}

	
}
