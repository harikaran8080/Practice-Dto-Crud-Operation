package com.AgainDtoPractice2.PracticeDto2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="works")
public class Works {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int wNo;
	
	private String wName;
	
	private int salary;

}
