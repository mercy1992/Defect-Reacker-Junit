package com.sgic.internal.defecttracker.project.services.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sgic.internal.defecttracker.project.entities.Config;
import com.sgic.internal.defecttracker.project.repositories.ConfigRepositories;
import com.sgic.internal.defecttracker.project.services.ConfigServices;


@Service
public class ConfigServicesimpl implements ConfigServices {

	@Autowired
	private ConfigRepositories configRepositories;
	
	private static Logger logger = LogManager.getLogger(ConfigServicesimpl.class);
	
	//Create Config service implementation
	@Override
	public Object createConfig(Config config) {
		// TODO Auto-generated method stub
		return configRepositories.save(config);
	}

	// Config exists implementation
	@Override
	@Transactional(readOnly = true)
	public boolean isDefectTypeAlreadyExists(int id) {
		// TODO Auto-generated method stub
		return configRepositories.existsById(id);
	}

	// Find Config by id implementation
	@Override
	public Config findConfigById(int id) {
		// TODO Auto-generated method stub
		return configRepositories.findById(id).orElse(null);
	}

	// List all Config implementation
	@Override
	public List<Config> findAllConfig() {
		List<Config> config = configRepositories.findAll();
		return config;
	}

	// Delete Config implementation
	@Override
	public Boolean deleteConfigById(int id) {
		configRepositories.deleteById(id);
		return true;
	}
	

}
