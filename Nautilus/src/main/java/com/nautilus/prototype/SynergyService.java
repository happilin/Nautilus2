package com.nautilus.prototype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nautilus.mapper.ChampionMapper;
import com.nautilus.mapper.ClassMapper;
import com.nautilus.mapper.OriginMapper;
import com.nautilus.repository.ChampionRepository;
import com.nautilus.repository.ClassRepository;
import com.nautilus.repository.OriginRepository;
import com.nautilus.vo.Champion;
import com.nautilus.vo.Classes;
import com.nautilus.vo.Origins;

@Service
public class SynergyService {

	@Autowired
	private ChampionRepository chamRepo;

	@Autowired
	private ClassRepository classRepo;
	
	@Autowired
	private OriginRepository originRepo;
	
	@Autowired
	private ChampionMapper chamMapper;
	
	@Autowired
	private ClassMapper classMapper;
	
	@Autowired
	private OriginMapper originMapper;
	
	public List<Champion> getChamList(){
		return chamRepo.findAll();
	}
	
	public List<String> getChamListByOrigin(String originName) {
		return chamMapper.getChampionByOrigin(originName);
	}
	
	public List<Origins> getOriginsList() {
		return originRepo.findAll();
	}
	
	public List<Classes> getClassesList(){
		return classRepo.findAll();
	}
	


	public void saveCham(Champion champion) {
		chamRepo.save(champion);
	}

	public Origins test() {
		Origins ori = originRepo.findByOriginName("길드");
		return ori;
	}

	public Champion syn_by_cham() {
		Champion name = chamRepo.syn_by_cham("세주아니");
		return name;
	}




}
