package com.company.demo.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class EmployeeConfig {

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {
        return args -> {
            Employee riza = new Employee(
                    "Riza Ozer",
                    "rizaoozer@gmail.com",
                    1000.0
            );

            Employee tim = new Employee(
                    "Tim Johnson",
                    "timjohnson@gmail.com",
                    700.0
            );

            employeeRepository.saveAll(
                    List.of(riza, tim)
            );
        };
    }
}
