package com.yash.azureapp.controller;

import com.yash.azureapp.EmployeeRepository;
import com.yash.azureapp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CRUDController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping("/")
    public String greeting()
    {
        return "Yash Loves Pooja ,But Pooja doesn't think so";
    }

    @PostMapping("/create")
    public void create(@RequestBody Employee employee)
    {

        System.out.println(employee);
        employeeRepository.save(Employee.builder()
                        .empName(employee.getEmpName())
                .build());
    }
}
