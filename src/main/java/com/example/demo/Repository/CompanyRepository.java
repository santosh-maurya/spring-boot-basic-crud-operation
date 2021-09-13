package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.CompanyEntity;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity,Long> {

}
