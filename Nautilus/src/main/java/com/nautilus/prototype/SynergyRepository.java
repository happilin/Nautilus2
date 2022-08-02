package com.nautilus.prototype;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nautilus.vo.Champion;

@Repository
public interface SynergyRepository extends JpaRepository<Champion,Integer>{

}
