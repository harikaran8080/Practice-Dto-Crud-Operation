package com.AgainDtoPractice2.PracticeDto2.service;

import java.util.List;

import com.AgainDtoPractice2.PracticeDto2.dto.WorksToDto;
import com.AgainDtoPractice2.PracticeDto2.entity.Works;

public interface ServiceImplement {

	Works post(WorksToDto dto);

	List<Works> postall( List<Works> dto);

	Works get(int wNo);

	List<WorksToDto> getall();

	Works update(WorksToDto dto);

	
}
