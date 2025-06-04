package com.example.sriindudemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//import com.example.sriindudemo.ioc.DemoIoc;
import com.example.sriindudemo.ioc.Student;

@SpringBootApplication
public class SriindudemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(SriindudemoApplication.class, args);
		
		//DemoIoc ob=con.getBean(DemoIoc.class);
		//ob.display();
		Student s=con.getBean(Student.class);
		s.print();
	}

}
