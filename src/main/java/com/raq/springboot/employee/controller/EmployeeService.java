package com.raq.springboot.employee.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.raq.springboot.employee.vo.EmployeeVO;

@Service
public class EmployeeService {

	private List<EmployeeVO> employees 
			= new ArrayList<>(Arrays.asList(
					new EmployeeVO(1, "AbdulRaquib", 20,2000d), 
					new EmployeeVO(2, "SyedJaffarAli", 30,3000d),
					new EmployeeVO(3, "AbdulRaafay", 40,4000d)));

	public List<EmployeeVO> getEmployees() {
		System.out.println("EmployeeService.getEmployees() called");
		return employees;
	}
	
	public EmployeeVO getEmployee(int id) {
		return employees.stream().filter(t -> t.getId() == id).findFirst().get();
	}

	public void addEmployee(EmployeeVO employee) {
		employees.add(employee);
		System.out.println("EmployeeService.addEmployee() invoked " + employee);
	}

	public void updateEmployee(EmployeeVO employee) {
		System.out.println("EmployeeService.updateEmployee() invoked " + employee);
		
	}

	public void deleteEmployee(int id) {
		System.out.println("EmployeeService.deleteEmployee() invoked " + id);
	}

	
}
