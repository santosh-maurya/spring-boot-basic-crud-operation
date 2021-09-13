package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.ReportEntity;

@Repository
public interface ReportRepository extends JpaRepository<ReportEntity, Long>{

}
