package com.company.demo.employee;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class EmployeeService {
    @GetMapping
    public List<Employee> getStudents() {
        return List.of(new Employee(
                1L,
                "Riza Ozer",
                "rizaoozer@gmail.com",
                1200));
    }
}
