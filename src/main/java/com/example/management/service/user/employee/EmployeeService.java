package com.example.management.service.user.employee;

import com.example.management.dto.user.EmployeeResponseDTO;
import com.example.management.entity.user.employee.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee create(EmployeeResponseDTO employeeResponseDTO);
}
