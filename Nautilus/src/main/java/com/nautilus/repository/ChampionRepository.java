package com.nautilus.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nautilus.vo.Champion;

@Repository
public interface ChampionRepository extends JpaRepository<Champion,String>{

	Champion syn_by_cham(String string);

}
