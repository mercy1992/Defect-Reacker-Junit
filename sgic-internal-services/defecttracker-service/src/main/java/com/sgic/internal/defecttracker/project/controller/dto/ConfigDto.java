package com.sgic.internal.defecttracker.project.controller.dto;

import org.springframework.stereotype.Component;

@Component
public class ConfigDto {

	private int id; // Config id
	private String name; // Config name
	private String value; // Config value
	
	public int getId() {
		return id;
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
