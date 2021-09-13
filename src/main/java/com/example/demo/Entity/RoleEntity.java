package com.example.demo.Entity;

import java.util.List;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Repository.RoleRepository;

@Entity
@Table(name="role")
public class RoleEntity {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="role_name",nullable = false)
	private String role_name;
	
	@Column(name="status", nullable = false)
	private int status;

	public RoleEntity(long id, String role_name, int status) {
		super();
		this.id = id;
		this.role_name = role_name;
		this.status = status;
	}

	public RoleEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "RoleEntity [id=" + id + ", role_name=" + role_name + ", status=" + status + ", getId()=" + getId()
				+ ", getRole_name()=" + getRole_name() + ", getStatus()=" + getStatus() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	

	
}
