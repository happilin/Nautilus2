package com.nautilus.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Entity
@Table(name="origineff")
public class OriginEffect {

	@Id
	private int number;
	
	@Column(name="originname")
	private String originName;
	
	@Column(name="membernum")
	private int memberNum;
	
	@Column(name="origineffect")
	private String originEffect;
}