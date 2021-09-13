package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.CompanyEntity;
import com.example.demo.Repository.CompanyRepository;

@RestController
@RequestMapping("/api/company/")
public class ComController {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@GetMapping("/find")
	public List<CompanyEntity> find()
	{
		return companyRepository.findAll();
	}
	
	@PostMapping("/insert")
	public CompanyEntity insert(@RequestBody CompanyEntity comp)
	{
		return companyRepository.save(comp);
	}
	
	

}
