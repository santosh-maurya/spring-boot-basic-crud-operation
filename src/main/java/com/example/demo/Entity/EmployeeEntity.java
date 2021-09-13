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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employe")
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="name")
	private String name;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="dep_id", nullable = false)
	private DepartmentEntity dep;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="role_id", nullable = false)
	private RoleEntity role;

	public EmployeeEntity(long id, String name, DepartmentEntity dep, RoleEntity role) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.role = role;
	}

	public EmployeeEntity() {
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

	public DepartmentEntity getDep() {
		return dep;
	}

	public void setDep(DepartmentEntity dep) {
		this.dep = dep;
	}

	public RoleEntity getRole() {
		return role;
	}

	public void setRole(RoleEntity role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", dep=" + dep + ", role=" + role + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getDep()=" + getDep() + ", getRole()=" + getRole()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
}
