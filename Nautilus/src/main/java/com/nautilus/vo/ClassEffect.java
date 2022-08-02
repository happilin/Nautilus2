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
@Table(name="classeff")
public class ClassEffect {

	@Id
	private int number;
	
	@Column(name="class_name")
	private String className;
	
	@Column(name="member_num")
	private int memberNum;
	
	@Column(name="class_effect")
	private String classEffect;
}
