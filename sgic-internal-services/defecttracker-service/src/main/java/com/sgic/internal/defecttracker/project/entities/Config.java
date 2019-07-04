package com.sgic.internal.defecttracker.project.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Entity
@Component
@Table(schema = "project_service", name = "Config")
public class Config implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private String value;
	
	public int getId() {
		return id;
	}
	
	
	
	public Config(int id, String name, String value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}
	public Config() {
		
	}

	
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	

}
