package com.example.management.service.user.employee.impl;

import com.example.management.dto.user.EmployeeResponseDTO;
import com.example.management.entity.user.Authority;
import com.example.management.entity.user.User;
import com.example.management.entity.user.employee.Employee;
import com.example.management.repository.user.UserRepository;
import com.example.management.repository.user.employee.EmployeeRepository;
import com.example.management.service.user.employee.EmployeeService;
import com.example.management.service.user.user.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthorityService authorityService;
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee create(EmployeeResponseDTO employeeResponseDTO) {
        User user = userRepository.findByUsername(employeeResponseDTO.getUsername())
                .orElseThrow(() -> new NoSuchElementException("User not found with username: "
                + employeeResponseDTO.getUsername()));
        Employee employee = new Employee();
        employee.setEmployeeName(employeeResponseDTO.getEmployeeName());
        employee.setEmail(employeeResponseDTO.getEmail());
        employee.setPhone(employeeResponseDTO.getPhone());

        List<Authority> authorities = authorityService.findByName("ROLE_EMPLOYEE");
        user.setAuthorities(authorities);

        employee.setEmployee(user);
        employeeRepository.save(employee);
        return employee;
    }
}
