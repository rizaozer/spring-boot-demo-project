package com.company.demo;

import com.company.demo.employee.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Employee> hello() {
		return List.of(new Employee(
				1L,
				"Riza Ozer",
				"rizaoozer@gmail.com",
				1200));
	}

}
