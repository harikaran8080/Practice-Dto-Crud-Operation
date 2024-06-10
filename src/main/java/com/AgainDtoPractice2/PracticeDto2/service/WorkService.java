package com.AgainDtoPractice2.PracticeDto2.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AgainDtoPractice2.PracticeDto2.dto.WorksToDto;
import com.AgainDtoPractice2.PracticeDto2.entity.Works;
import com.AgainDtoPractice2.PracticeDto2.repository.WorksRepository;

@Service
public class WorkService implements ServiceImplement {

	@Autowired
	private WorksRepository repository;

	@Override
	public Works post(WorksToDto dto) {
		Works works = new Works();
		works.setSalary(dto.getSalary());
		works.setWName(dto.getWName());
		works.setWNo(dto.getWNo());
		repository.save(works);
		return works;
	}

	@Override
	public List<Works> postall(List<Works> dto) {
		List<Works> list = repository.saveAll(dto);
		return list;
	}

	@Override
	public Works get(int wNo) {
		Optional<Works> optional = repository.findById(wNo);
		Works works = optional.get();
		WorksToDto dto = new WorksToDto();
		dto.setSalary(works.getSalary());
		dto.setWName(works.getWName());
		dto.setWNo(works.getWNo());
		repository.save(works);
		return works;
	}

	@Override
	public List<WorksToDto> getall() {
		List<Works> list = repository.findAll();
		List<WorksToDto> dtos = new ArrayList<>();
		for (Works w : list) {
			WorksToDto dto = new WorksToDto();
			dto.setSalary(w.getSalary());
			dto.setWName(w.getWName());
			dto.setWNo(w.getWNo());
			dtos.add(dto);
			
			

		}
		return dtos;

	}

	@Override
	public Works update(WorksToDto dto) {
		Optional<Works>optional=repository.findById(dto.getWNo());
		Works works=optional.get();
		works.setSalary(dto.getSalary());
		works.setWName(dto.getWName());
		works.setWNo(dto.getWNo());
		return repository.save(works);
	}

}
