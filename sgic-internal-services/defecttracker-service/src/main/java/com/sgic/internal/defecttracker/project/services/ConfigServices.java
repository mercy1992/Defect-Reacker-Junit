package com.sgic.internal.defecttracker.project.services;

import java.util.List;

import com.sgic.internal.defecttracker.project.entities.Config;

public interface ConfigServices {
	
	public Object createConfig(Config config); //Create Config
	public boolean isDefectTypeAlreadyExists(int id); //Check Config is Already Exists 
	Config findConfigById(int id); // Get Config By Id
	List<Config> findAllConfig(); //List all Config
	Boolean deleteConfigById(int id);// Delete Config 

}
