package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.EmployeeEntity;
import com.example.demo.Repository.EmployeeRepository;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/find")
	public List<EmployeeEntity> find() throws JsonParseException
	{
		return employeeRepository.findAll();
	}
	
	@PostMapping("/insert")
	public EmployeeEntity insert(@RequestBody EmployeeEntity emp)
	{
		return employeeRepository.save(emp);
	}
	

}
