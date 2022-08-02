package com.nautilus.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Entity
@Table(name="champions")
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name="sp_syn_by_cham",
			procedureName = "syn_by_cham",
			resultClasses = Champion.class,
			parameters = {
				@StoredProcedureParameter(mode=ParameterMode.IN, type=String.class),
				@StoredProcedureParameter(mode=ParameterMode.REF_CURSOR, type=void.class)
			}
	)
})
public class Champion {

	
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="num")
	private int championNum;
	
	//챔피언 이름 계열 길드
	@Id
	@Column(name="name")
	private String name;
	
	@Column(name="synergy1")
	private String synergy1;
	
	@Column(name="synergy2")
	private String synergy2;
	
	@Column(name="synergy3")
	private String synergy3;
	
//	private int cost;
//	private int health;
//	private int attack;
//	private int depen;
//	private int range;
//	private float attack_speed;
//	private int dps;
//	
//	private int skill_num;
//	private String skill_name;
//	
//	private String mana;
}
