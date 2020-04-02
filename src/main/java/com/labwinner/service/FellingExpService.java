package com.labwinner.service;

import java.util.List;

import com.labwinner.domain.FellingExp;

public interface FellingExpService {
	

	public void save(FellingExp fellingExp);
	
	public void update(FellingExp fellingExp);
	
	public void delete(Integer id);
	
	public FellingExp getById(Integer id);
	
	public List<FellingExp> getByName(String name);
	
	public List<FellingExp> getAll();

}
