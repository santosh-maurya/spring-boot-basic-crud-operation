package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.DepartmentEntity;
import com.example.demo.Repository.DepartmentRepository;

@RestController
@RequestMapping("/api/department/")
public class DepartmentController 
{
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@GetMapping("/find")
	public List<DepartmentEntity> find()
	{
		return departmentRepository.findAll();
	}
	
	@PostMapping("/insert")
	public DepartmentEntity insert(@RequestBody DepartmentEntity dep)
	{
		return departmentRepository.save(dep);
	}

}
