package com.AgainDtoPractice2.PracticeDto2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AgainDtoPractice2.PracticeDto2.dto.WorksToDto;
import com.AgainDtoPractice2.PracticeDto2.entity.Works;
import com.AgainDtoPractice2.PracticeDto2.service.ServiceImplement;
@RestController
@RequestMapping("/Works/Api")
public class WorksController {
	
	@Autowired
	private ServiceImplement implement;
	
	@PostMapping("/post")
	public Works post(@RequestBody WorksToDto dto) {
		return implement.post(dto);
	}
	
	@PostMapping("/postall")
	public List<Works> postall(@RequestBody  List<Works> dto){
		return implement.postall(dto);
	}
	
	@GetMapping("/get/{wNo}")
	public Works get(@PathVariable int wNo) {
		return implement.get(wNo);
		
	}
	
	@GetMapping("getall")
	public List<WorksToDto>getall(){
		return implement.getall();
	}
	
	@PutMapping("/update")
	public Works update(@RequestBody WorksToDto dto) {
		return implement.update(dto);
	}
	
	
}
