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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="report")
public class ReportEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name="report",nullable = false)
	private String report;
	
	@Column(name="status", nullable = false)
	private int status;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="emp_id",nullable = false)
	private EmployeeEntity  emp;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private EmployeeEntity boss;

	public ReportEntity(long id, String report, int status, EmployeeEntity emp, EmployeeEntity boss) {
		super();
		this.id = id;
		this.report = report;
		this.status = status;
		this.emp = emp;
		this.boss = boss;
	}

	public ReportEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public EmployeeEntity getEmp() {
		return emp;
	}

	public void setEmp(EmployeeEntity emp) {
		this.emp = emp;
	}

	public EmployeeEntity getBoss() {
		return boss;
	}

	public void setBoss(EmployeeEntity boss) {
		this.boss = boss;
	}

	@Override
	public String toString() {
		return "ReportEntity [id=" + id + ", report=" + report + ", status=" + status + ", emp=" + emp + ", boss="
				+ boss + ", getId()=" + getId() + ", getReport()=" + getReport() + ", getStatus()=" + getStatus()
				+ ", getEmp()=" + getEmp() + ", getBoss()=" + getBoss() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	

}
