package com.example.demo.Entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="company")
public class CompanyEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="company_name", nullable = true)
	private String company_name;

	
	@Column(name="status", nullable = false)
	private String status;


	public CompanyEntity(long id, String company_name, String status) {
		super();
		this.id = id;
		this.company_name = company_name;
		this.status = status;
	}


	public CompanyEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getCompany_name() {
		return company_name;
	}


	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "CompanyEntity [id=" + id + ", company_name=" + company_name + ", status=" + status + ", getId()="
				+ getId() + ", getCompany_name()=" + getCompany_name() + ", getStatus()=" + getStatus()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
	

}
