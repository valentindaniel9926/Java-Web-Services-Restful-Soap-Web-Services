package com.vali.rest;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

	@GetMapping("/employee")
	public Employee getEmployee() {
		Employee employee =  new Employee();
		employee.setFirstName("Valentin");
		employee.setLastName("Daniel");
		return employee;
	}
}
