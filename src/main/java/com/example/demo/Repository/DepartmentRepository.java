package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.DepartmentEntity;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Long>{
	
	@Query(value= "Select * from department d  left join company c on d.id=c.id", nativeQuery = true)
	public List<DepartmentEntity> findAllData();

}
