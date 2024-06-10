package com.AgainDtoPractice2.PracticeDto2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AgainDtoPractice2.PracticeDto2.entity.Works;

@Repository
public interface WorksRepository extends JpaRepository<Works, Integer> {

}
