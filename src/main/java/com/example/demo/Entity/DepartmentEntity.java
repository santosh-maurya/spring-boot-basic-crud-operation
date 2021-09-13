package com.example.demo.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="department")
public class DepartmentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="status")
	private String status;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="com_id", nullable = false)
	private CompanyEntity com;

	public DepartmentEntity(long id, String name, String status, CompanyEntity com) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.com = com;
	}

	public DepartmentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public CompanyEntity getCom() {
		return com;
	}

	public void setCom(CompanyEntity com) {
		this.com = com;
	}

	@Override
	public String toString() {
		return "DepartmentEntity [id=" + id + ", name=" + name + ", status=" + status + ", com=" + com + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getStatus()=" + getStatus() + ", getCom()=" + getCom()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


}
