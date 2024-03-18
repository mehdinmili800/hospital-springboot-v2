package com.example.management.controller.user.employee;

import com.example.management.dto.user.EmployeeResponseDTO;
import com.example.management.entity.user.employee.Employee;
import com.example.management.service.user.employee.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_EMPLOYEE')")
    @PostMapping(value = "/employee/create")
    public Employee create(@RequestBody EmployeeResponseDTO employeeResponseDTO){
        return employeeService.create(employeeResponseDTO);
    }

    @GetMapping(value = "/employee/all")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
}
