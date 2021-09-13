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
import com.example.demo.Entity.RoleEntity;
import com.example.demo.Repository.RoleRepository;

@RestController
@RequestMapping("/api/role/")
public class RoleController {
	
	@Autowired
	private RoleRepository roleRepository;
	
	
	@GetMapping("/find")
	public List<RoleEntity> find() throws JsonParseException
	{
		return roleRepository.findAll();
	}
	
	@PostMapping("/insert")
	public RoleEntity insert(@RequestBody RoleEntity emp)
	{
		return roleRepository.save(emp);
	}
	

}
