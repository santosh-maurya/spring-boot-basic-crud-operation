package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.ReportEntity;
import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Repository.ReportRepository;

@RestController
@RequestMapping("/api/report/")
public class ReportController {
	
	@Autowired
	private ReportRepository reportRepository;
	
	
	@GetMapping("/find")
	public List<ReportEntity> find()
	{
		return reportRepository.findAll();
	}
	
	@PostMapping("/insert")
	public ReportEntity insert(@RequestBody ReportEntity report)
	{
		return reportRepository.save(report);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<ReportEntity> findByID(@PathVariable long id) throws ResourceNotFoundException
	{
		ReportEntity report = reportRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("ID Not match any data !!"+id));
		
		return ResponseEntity.ok(report);
	}
	

}
